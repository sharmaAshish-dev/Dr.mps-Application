package com.ashish.drmps;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.tabs.TabLayout;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class HomeFragement extends Fragment {

    Dialog popup1, popup2, popup3, popup4, popup5, popup6, popup7, popup8, popup9, popup10, popup11;
    private ViewPager2 viewPager2, viewPager3;
    private Handler sliderHandler = new Handler();
    private CardView aluminiCard1, aluminiCard2, aluminiCard3, aluminiCard4, aluminiCard5, aluminiCard6;
    private CardView vipCard1, vipCard2, vipCard3, vipCard4, vipCard5;
    private CardView GroupCard1,GroupCard2,GroupCard3;
    private CardView moreMedia;

    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            viewPager3.setCurrentItem(viewPager3.getCurrentItem() + 1);
        }
    };

    public HomeFragement() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        viewPager2 = view.findViewById(R.id.imageSlider);
        viewPager3 = view.findViewById(R.id.imageSlider2);

        aluminiCard1 = view.findViewById(R.id.ACard1);
        aluminiCard2 = view.findViewById(R.id.ACard2);
        aluminiCard3 = view.findViewById(R.id.ACard3);
        aluminiCard4 = view.findViewById(R.id.ACard4);
        aluminiCard5 = view.findViewById(R.id.ACard5);
        aluminiCard6 = view.findViewById(R.id.ACard6);

        vipCard1 = view.findViewById(R.id.vipCard1);
        vipCard2 = view.findViewById(R.id.vipCard2);
        vipCard3 = view.findViewById(R.id.vipCard3);
        vipCard4 = view.findViewById(R.id.vipCard4);
        vipCard5 = view.findViewById(R.id.vipCard5);

        GroupCard1 = view.findViewById(R.id.GroupCard1);
        GroupCard2 = view.findViewById(R.id.GroupCard2);
        GroupCard3 = view.findViewById(R.id.GroupCard3);

        moreMedia = view.findViewById(R.id.moreBtn);

        moreMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),gallery.class));
            }
        });

        GroupCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("website", url);
                startActivity(intent);
            }
        });

        GroupCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsworldschool.com/";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("website", url);
                startActivity(intent);
            }
        });

        GroupCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.matajhandewalaneducation.com/";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("website", url);
                startActivity(intent);
            }
        });

        popup1 = new Dialog(getActivity());
        popup2 = new Dialog(getActivity());
        popup3 = new Dialog(getActivity());
        popup4 = new Dialog(getActivity());
        popup5 = new Dialog(getActivity());
        popup6 = new Dialog(getActivity());
        popup7 = new Dialog(getActivity());
        popup8 = new Dialog(getActivity());
        popup9 = new Dialog(getActivity());
        popup10 = new Dialog(getActivity());
        popup11 = new Dialog(getActivity());

        aluminiCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup1(view);
            }
        });
        aluminiCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup2(view);
            }
        });
        aluminiCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup3(view);
            }
        });
        aluminiCard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup4(view);
            }
        });
        aluminiCard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup5(view);
            }
        });
        aluminiCard6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup6(view);
            }
        });

        vipCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup7(view);
            }
        });
        vipCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup8(view);
            }
        });
        vipCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup9(view);
            }
        });
        vipCard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup10(view);
            }
        });
        vipCard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup11(view);
            }
        });

        List<sliderItem> sliderItem = new ArrayList<>();
        List<sliderItem> sliderItem2 = new ArrayList<>();

        sliderItem.add(new sliderItem(R.drawable.home1));         //             Images to be shown on page
        sliderItem.add(new sliderItem(R.drawable.home2));
        sliderItem.add(new sliderItem(R.drawable.home3));
        sliderItem.add(new sliderItem(R.drawable.home7));
        sliderItem.add(new sliderItem(R.drawable.home5));
        sliderItem.add(new sliderItem(R.drawable.home6));
        sliderItem.add(new sliderItem(R.drawable.home4));

        sliderItem2.add(new sliderItem(R.drawable.media1));         //             Images to be shown on page
        sliderItem2.add(new sliderItem(R.drawable.media2));
        sliderItem2.add(new sliderItem(R.drawable.media3));
        sliderItem2.add(new sliderItem(R.drawable.media4));
        sliderItem2.add(new sliderItem(R.drawable.media5));
        sliderItem2.add(new sliderItem(R.drawable.media6));

        viewPager2.setAdapter(new sliderAdapter(sliderItem, viewPager2));
        viewPager3.setAdapter(new sliderAdapter(sliderItem2, viewPager3));

        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        viewPager3.setClipToPadding(false);
        viewPager3.setClipChildren(false);
        viewPager3.setOffscreenPageLimit(3);
        viewPager3.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(25));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        viewPager2.setPageTransformer(compositePageTransformer);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 2000);     //Slide Duration 2 seconds
            }
        });

        CompositePageTransformer compositePageTransformer2 = new CompositePageTransformer();
        compositePageTransformer2.addTransformer(new MarginPageTransformer(25));
        compositePageTransformer2.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        viewPager3.setPageTransformer(compositePageTransformer2);
        viewPager3.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 2000);     //Slide Duration 2 seconds
            }
        });
        return view;
    }

    public void showPopup1(View view) {
        TextView closeBtn;
        popup1.setContentView(R.layout.popup1);
        closeBtn = (TextView) popup1.findViewById(R.id.closeBtn);
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup1.dismiss();
            }
        });
        popup1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Window window = popup1.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAnimation;
        popup1.show();
    }

    public void showPopup2(View view) {
        TextView closeBtn;
        popup2.setContentView(R.layout.popup2);
        closeBtn = (TextView) popup2.findViewById(R.id.closeBtn);
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup2.dismiss();
            }
        });
        popup2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Window window = popup2.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAnimation;
        popup2.show();
    }

    public void showPopup3(View view) {
        TextView closeBtn;
        popup3.setContentView(R.layout.popup3);
        closeBtn = (TextView) popup3.findViewById(R.id.closeBtn);
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup3.dismiss();
            }
        });
        popup3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Window window = popup3.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAnimation;
        popup3.show();
    }

    public void showPopup4(View view) {
        TextView closeBtn;
        popup4.setContentView(R.layout.popup4);
        closeBtn = (TextView) popup4.findViewById(R.id.closeBtn);
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup4.dismiss();
            }
        });
        popup4.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Window window = popup4.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAnimation;
        popup4.show();
    }

    public void showPopup5(View view) {
        TextView closeBtn;
        popup5.setContentView(R.layout.popup5);
        closeBtn = (TextView) popup5.findViewById(R.id.closeBtn);
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup5.dismiss();
            }
        });
        popup5.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Window window = popup5.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAnimation;
        popup5.show();
    }

    public void showPopup6(View view) {
        TextView closeBtn;
        popup6.setContentView(R.layout.popup6);
        closeBtn = (TextView) popup6.findViewById(R.id.closeBtn);
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup6.dismiss();
            }
        });
        popup6.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Window window = popup6.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAnimation;
        popup6.show();
    }

    public void showPopup7(View view) {
        TextView closeBtn;
        popup7.setContentView(R.layout.popupjiten);
        closeBtn = (TextView) popup7.findViewById(R.id.closeBtn);
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup7.dismiss();
            }
        });
        popup7.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Window window = popup7.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAnimation;
        popup7.show();
    }

    public void showPopup8(View view) {
        TextView closeBtn;
        popup8.setContentView(R.layout.popupashok);
        closeBtn = (TextView) popup8.findViewById(R.id.closeBtn);
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup8.dismiss();
            }
        });
        popup8.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Window window = popup8.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAnimation;
        popup8.show();
    }

    public void showPopup9(View view) {
        TextView closeBtn;
        popup9.setContentView(R.layout.popupak);
        closeBtn = (TextView) popup9.findViewById(R.id.closeBtn);
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup9.dismiss();
            }
        });
        popup9.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Window window = popup9.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAnimation;
        popup9.show();
    }

    public void showPopup10(View view) {
        TextView closeBtn;
        popup10.setContentView(R.layout.popupneel);
        closeBtn = (TextView) popup10.findViewById(R.id.closeBtn);
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup10.dismiss();
            }
        });
        popup10.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Window window = popup10.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAnimation;
        popup10.show();
    }

    public void showPopup11(View view) {
        TextView closeBtn;
        popup11.setContentView(R.layout.popupcp);
        closeBtn = (TextView) popup11.findViewById(R.id.closeBtn);
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popup11.dismiss();
            }
        });
        popup11.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Window window = popup11.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAnimation;
        popup11.show();
    }

}