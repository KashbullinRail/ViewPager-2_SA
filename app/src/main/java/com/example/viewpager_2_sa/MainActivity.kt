package com.example.viewpager_2_sa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    private lateinit var adapter: NumberAdapter
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    private val tabNames: Array<String> = arrayOf(
        "Первый",
        "Второй",
        "Третий",
        "Четвертый",
        "Пятый",
        "Шестой",
        "Седьмой"
    )

    private val tabNumber: Array<Int> = arrayOf(
        R.drawable.ic_baseline_30fps_24,
        R.drawable.ic_baseline_airport_shuttle_24,
        R.drawable.ic_baseline_brightness_5_24,
        R.drawable.ic_baseline_euro_24,
        R.drawable.ic_baseline_donut_small_24,
        R.drawable.ic_baseline_filter_alt_24,
        R.drawable.ic_baseline_fitbit_24
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = NumberAdapter(this)
        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = adapter

        tabLayout = findViewById(R.id.tabLayout)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = tabNames[position]

            //Set icon drawable
            tab.setIcon(tabNumber[position])

            //Add badge in tabLayout
            if (position == 2) {
                val badge = tab.orCreateBadge
                badge.number = 2
            }

        }.attach()

    }
}