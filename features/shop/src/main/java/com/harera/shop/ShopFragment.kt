package com.harera.shop

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isNotEmpty
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.harera.common.utils.navigation.Arguments
import com.harera.common.utils.navigation.Destinations
import com.harera.common.utils.navigation.NavigationUtils
import com.harera.repository.domain.Category
import com.harera.repository.domain.Offer
import com.harera.repository.domain.Product
import com.harera.shop.databinding.FragmentShopBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class ShopFragment : Fragment() {

    private lateinit var shopViewModel: ShopViewModel
    private lateinit var bind: FragmentShopBinding

    private lateinit var offersAdapter: OffersAdapter
    private lateinit var productsAdapter: ProductsAdapter
    private lateinit var categoriesAdapter: CategoriesAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?,
    ): View {
        bind = FragmentShopBinding.inflate(layoutInflater)
        shopViewModel = ViewModelProvider(this).get(ShopViewModel::class.java)

        offersAdapter = OffersAdapter(
            onOfferClicked = {
                viewOffer(it)
            }
        )

        productsAdapter = ProductsAdapter(
            onProductClicked = { productId ->
                viewProduct(productId)
            }
        )

        categoriesAdapter = CategoriesAdapter(
            onCategoryClicked = {
                viewCategoryProducts(it)
            }
        )
        return bind.root
    }

    private fun viewCategoryProducts(categoryId: String) {
        findNavController().navigate(
            Uri.parse(
                NavigationUtils.getUriNavigation(
                    Arguments.HYPER_PANDA_DOMAIN,
                    Destinations.CATEGORIES,
                    categoryId
                )
            )
        )
    }

    private fun viewProduct(productId: String) {
        findNavController().navigate(
            Uri.parse(
                NavigationUtils.getUriNavigation(
                    Arguments.HYPER_PANDA_DOMAIN,
                    Destinations.PRODUCT,
                    productId
                )
            )
        )
    }

    private fun viewOffer(offerId: String) {
        findNavController().navigate(
            Uri.parse(
                NavigationUtils.getUriNavigation(
                    Arguments.HYPER_PANDA_DOMAIN,
                    Destinations.OFFER,
                    offerId
                )
            )
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupOffersAdapter()
        setupProductsAdapter()
        setupCategoriesAdapter()
        lifecycleScope.launch {
            setupObserves()
        }
        setupListeners()

        shopViewModel.getOffers()
        shopViewModel.getProducts()
        shopViewModel.getCategories()
    }

    private fun setupRecyclerListener() {
        bind.products.addOnScrollListener(
            object : RecyclerView.OnScrollListener() {
                override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                    if (bind.products.isNotEmpty() && !bind.products.canScrollVertically(View.SCROLL_AXIS_VERTICAL))
                        shopViewModel.nextPage()
                }
            }
        )
    }

    private fun setupListeners() {
        bind.btnViewMore.setOnClickListener {
            findNavController().navigate(
                Uri.parse(
                    NavigationUtils.getUriNavigation(
                        Arguments.HYPER_PANDA_DOMAIN,
                        Destinations.CATEGORIES,
                        "null"
                    )
                )
            )
        }
    }

    private fun setupOffersAdapter() {
        bind.offers.adapter = offersAdapter
        bind.offers.clipToPadding = false
        bind.offers.clipChildren = false
        bind.offers.offscreenPageLimit = 3
        bind.offers.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
    }

    private fun setupCategoriesAdapter() {
        bind.categories.adapter = categoriesAdapter
        bind.categories.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun setupProductsAdapter() {
        bind.products.adapter = productsAdapter
        bind.products.layoutManager = GridLayoutManager(context, 2)
    }

    private fun setupObserves() {
        shopViewModel.offers.observe(viewLifecycleOwner) {
            updateOffers(it)
        }

        shopViewModel.products.observe(viewLifecycleOwner) {
            updateProducts(it)
        }

        shopViewModel.categories.observe(viewLifecycleOwner) {
            updateCategories(it)
        }
    }

    private fun updateCategories(categories: List<Category>) {
        categoriesAdapter.setCategories(categories)
    }

    private fun updateOffers(offers: List<Offer>) {
        offersAdapter.setOffers(offers)
    }

    private fun updateProducts(products: List<Product>) {
        productsAdapter.setProducts(products)
        setupRecyclerListener()
    }
}
