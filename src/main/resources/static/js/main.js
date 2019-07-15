(function ($) {
 "use strict";
    
    /*----------------------------
        Sidebar Toggle Menu
    ------------------------------ */
    $('.show-submenu').on('click', function() {
        $(this).parent().find('.submenu').toggleClass('submenu-active'); 
        $(this).toggleClass('submenu-active');  
        return false;  
    });
    
    /*----------------------------
        Toogle Search
    ------------------------------ */
    // Handle click on toggle search button
    $('#toggle-search').on('click', function() {
        $('.search').toggleClass('open');
        return false;
    });

    // Handle click on search submit button
    $('#search-form input[type=submit]').on('click', function() {
        $('.search').toggleClass('open');
        return true;
    });    
    
    /*----------------------------
        jQuery MeanMenu
    ------------------------------ */
	jQuery('nav#dropdown').meanmenu();	
	
    /*----------------------------
        wow js active
    ------------------------------ */
    new WOW().init();
 
    /*----------------------------
        Product Carousel
    ------------------------------ */  
    $(".product-carousel").owlCarousel({
        autoPlay: false, 
        slideSpeed:2000,
        pagination:false,
        navigation:true,	  
        items : 5,
        /* transitionStyle : "fade", */    /* [This code for animation ] */
        navigationText:["<i class='fa fa-caret-left'></i>","<i class='fa fa-caret-right'></i>"],
        itemsDesktop : [1199,4],
        itemsDesktopSmall : [980,3],
        itemsTablet: [768,2],
        itemsMobile : [479,1]
    });
    /*----------------------------
        New Product Carousel
    ------------------------------ */ 
    $(".new-products-carousel").owlCarousel({
        autoPlay: false, 
        slideSpeed:2000,
        pagination:false,
        navigation:false,	  
        items : 2,
        /* transitionStyle : "fade", */    /* [This code for animation ] */
        navigationText:["<i class='fa fa-caret-left'></i>","<i class='fa fa-caret-right'></i>"],
        itemsDesktop : [1199,2],
        itemsDesktopSmall : [980,3],
        itemsTablet: [768,2],
        itemsMobile : [479,1]
    });
    /*----------------------------
        Featured Product Carousel
    ------------------------------ */ 
    $(".featured-product-carousel").owlCarousel({
        autoPlay: false, 
        slideSpeed:2000,
        pagination:false,
        navigation:false,	  
        items : 4,
        /* transitionStyle : "fade", */    /* [This code for animation ] */
        navigationText:["<i class='fa fa-caret-left'></i>","<i class='fa fa-caret-right'></i>"],
        itemsDesktop : [1199,4],
        itemsDesktopSmall : [980,3],
        itemsTablet: [768,2],
        itemsMobile : [479,1]
    });
    /*----------------------------
        Blog Carousel
    ------------------------------ */ 
    $(".blog-carousel").owlCarousel({
        autoPlay: false, 
        slideSpeed:2000,
        pagination:false,
        navigation:false,	  
        items : 3,
        /* transitionStyle : "fade", */    /* [This code for animation ] */
        navigationText:["<i class='fa fa-caret-left'></i>","<i class='fa fa-caret-right'></i>"],
        itemsDesktop : [1199,3],
        itemsDesktopSmall : [980,2],
        itemsTablet: [768,1],
        itemsMobile : [479,1]
    });
    /*----------------------------
        Brand Carousel
    ------------------------------ */ 
    $(".brand-carousel").owlCarousel({
        autoPlay: false, 
        slideSpeed:2000,
        pagination:false,
        navigation:false,	  
        items : 5,
        /* transitionStyle : "fade", */    /* [This code for animation ] */
        navigationText:["<i class='fa fa-caret-left'></i>","<i class='fa fa-caret-right'></i>"],
        itemsDesktop : [1199,4],
        itemsDesktopSmall : [979,3],
        itemsLargeMobile : [767,2],
        itemsMobile : [450,1]
    });
    /*-------------------------------
        Home Three Featured Carousel
    --------------------------------*/ 
    $(".featured-product-carousel-three").owlCarousel({
        autoPlay: false, 
        slideSpeed:2000,
        pagination:false,
        navigation:true,	  
        items : 4,
        /* transitionStyle : "fade", */    /* [This code for animation ] */
        navigationText:["<i class='fa fa-caret-left'></i>","<i class='fa fa-caret-right'></i>"],
        itemsDesktop : [1199,4],
        itemsDesktopSmall : [980,3],
        itemsTablet: [768,2],
        itemsMobile : [479,1]
    });
    /*-------------------------------
        Testimonial Carousel
    --------------------------------*/ 
    $(".testimonial-carousel").owlCarousel({
        autoPlay: false, 
        slideSpeed:2000,
        pagination:true,
        navigation:true,	  
        items : 1,
        /* transitionStyle : "fade", */    /* [This code for animation ] */
        navigationText:["<i class='fa fa-angle-left'></i>","<i class='fa fa-angle-right'></i>"],
        itemsDesktop : [1199,1],
        itemsDesktopSmall : [980,1],
        itemsTablet: [768,1],
        itemsMobile : [479,1]
    });
    /*-------------------------------
        Home Three Blog Carousel
    --------------------------------*/ 
    $(".blog-carousel-three").owlCarousel({
        autoPlay: false, 
        slideSpeed:2000,
        pagination:false,
        navigation:true,	  
        items : 1,
        /* transitionStyle : "fade", */    /* [This code for animation ] */
        navigationText:["<i class='fa fa-angle-left'></i>","<i class='fa fa-angle-right'></i>"],
        itemsDesktop : [1199,1],
        itemsDesktopSmall : [980,1],
        itemsTablet: [768,1],
        itemsMobile : [479,1]
    });
    /*-------------------------------
        Home Four Featured Carousel
    --------------------------------*/ 
    $(".featured-product-carousel-four").owlCarousel({
        autoPlay: false, 
        slideSpeed:2000,
        pagination:false,
        navigation:true,	  
        items : 4,
        /* transitionStyle : "fade", */    /* [This code for animation ] */
        navigationText:["<i class='fa fa-angle-left'></i>","<i class='fa fa-angle-right'></i>"],
        itemsDesktop : [1199,4],
        itemsDesktopSmall : [980,3],
        itemsTablet: [768,2],
        itemsMobile : [479,1]
    });
    /*-------------------------------
        Sidebar Widget Carousel
    --------------------------------*/ 
    $(".sidebar-widget-carousel").owlCarousel({
        autoPlay: false, 
        slideSpeed:2000,
        pagination:false,
        navigation:false,	  
        items : 1,
        /* transitionStyle : "fade", */    /* [This code for animation ] */
        navigationText:["<i class='fa fa-angle-left'></i>","<i class='fa fa-angle-right'></i>"],
        itemsDesktop : [1199,1],
        itemsDesktopSmall : [980,1],
        itemsTablet: [768,1],
        itemsMobile : [479,1]
    });
    
    /*--------------------------
        scrollUp
    ---------------------------- */	
	$.scrollUp({
        scrollText: '<i class="fa fa-arrow-up"></i>',
        easingType: 'linear',
        scrollSpeed: 900,
        animation: 'fade'
    }); 
    
    /*----------------------------------
        Price-slider js
    ------------------------------------- */	
    $( "#slider-range" ).slider({
        range: true,
        min: 16,
        max: 61,
        values: [ 16, 61 ],
        slide: function( event, ui ) {
            $( "#amount" ).val( "£" + ui.values[ 0 ] + " - £" + ui.values[ 1 ] );
        }
    });
    $( "#amount" ).val( "£" + $( "#slider-range" ).slider( "values", 0 ) +
        " - £" + $( "#slider-range" ).slider( "values", 1 ) );
	   
    
    /*----------------------------
        BX slider
    ------------------------------ */ 
    $('.bxslider').bxSlider({
        minSlides: 4,
        maxSlides: 4,
        slideWidth:270,	 
        nextSelector: '#slider-next',
        prevSelector: '#slider-prev',
        prevText: '<i class="fa fa-chevron-circle-left"></i>',
        nextText: '<i class="fa fa-chevron-circle-right"></i>'
    });
    
    /*----------------------------
        Fancybox
    ------------------------------ */ 
    $(".fancybox").fancybox();
 
    /*----------------------------
        Input Plus Minus Button
    ------------------------------ */ 
    $(".cart-plus-minus").append('<div class="dec qtybutton">-</div><div class="inc qtybutton">+</div>');
	    $(".qtybutton").on("click", function() {
		var $button = $(this);
		var oldValue = $button.parent().find("input").val();
		if ($button.text() == "+") {
		  var newVal = parseFloat(oldValue) + 1;
		} else {
		   // Don't allow decrementing below zero
		  if (oldValue > 0) {
			var newVal = parseFloat(oldValue) - 1;
			} else {
			newVal = 0;
        }
        }
		$button.parent().find("input").val(newVal);
    });
    
    /*-------------------------
        showlogin toggle function
    --------------------------*/
    $( '#showlogin' ).on('click', function() {
        $( '#checkout-login' ).slideToggle(900);
    }); 
	
    /*-------------------------
        showcoupon toggle function
    --------------------------*/
    $( '#showcoupon' ).on('click', function() {
        $( '#checkout_coupon' ).slideToggle(900);
    });
	 
    /*--------------------------------
        Create an account toggle function
    ---------------------------------*/
    $( '#cbox' ).on('click', function() {
        $( '#cbox_info' ).slideToggle(900);
    });
	 
    /*---------------------------------
        Create an account toggle function
    ---------------------------------*/
    $( '#ship-box' ).on('click', function() {
        $( '#ship-box-info' ).slideToggle(1000);
    });	
    
    /* ---------------------------------
        payment-accordion
    * ---------------------------------*/ 
	$(".payment-accordion").collapse({
        accordion:true,
        open: function() {
		this.slideDown(550);
        },
        close: function() {
		this.slideUp(550);
        }		
	});  
    
})(jQuery); 