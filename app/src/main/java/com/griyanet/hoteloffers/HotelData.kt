package com.griyanet.hoteloffers

import java.nio.file.Files.list

object HotelData {
    private val hotelName = arrayOf(
        "Melia Bali",
        "INAYA Putri Bali",
        "Ayodya Resort Bali",
        "The Apurva Kempiski Bali",
        "Amnaya Resort Bali",
        "Hilton Bali Resort",
        "The St. Regis Bali Resort",
        "Swiss-Belhotel Segara Resort & Spa",
        "Samabe Bali Suites & Villas",
        "Conrad Bali",
        "The Ayodya Palace",
        "Grand Hyatt Bali",
        "Courtyard by Marriott Bali Nusa Dua Resort",
        "Amarterra Villas Bali Nusa Dua",
        "Uppala Villa Nusa Dua",
        "Nusa Dua Beach Hotel & Spa",
        "The Laguna, A Luxury Collection Resort & Spa",
        "D&G Villas Nusa Dua",
        "Sadara Boutique Beach Resort",
        "The Royal Santrian",
        "The Miracle Villa Nusa Dua",
        "SOL by Melia Benoa Bali All inclusive",
        "The Westin Resort Nusa Dua Bali",
        "Novotel Bali Benoa",
        "Mulia Villas"
    )

    private var starRating = floatArrayOf(
        5.0F,5.0F,5.0F,4.0F,5.0F,4.5F,5.0F,5.0F,4.5F,5.0F,5.0F,4.0F,5.0F,5.0F,4.0F,5.0F,5.0F,5.0F,4.5F,4.0F,5.0F,5.0F,4.0F,5.0F,5.0F
    )

    private var price = intArrayOf(
        1970113,1641600,1739599,3875630,990000,1293188,10890000,565250,6615812,
        1497375,4221538,2026109,1210000,3678400,2497500,1901681,2178000,3024000,
        1269047,15151500,1575000,1000000,1742400,980100,9713046
    )

    private var hotelPhoto = intArrayOf(
        R.drawable.melia_bali,
        R.drawable.inaya_putri_bali,
        R.drawable.ayodya_resort_bali,
        R.drawable.the_ampurva_kempinski,
        R.drawable.amnaya_resort_bali,
        R.drawable.hilton_bali_resort,
        R.drawable.the_st_regis_bali,
        R.drawable.swiss_belhotel_segara,
        R.drawable.samabe_bali_suites,
        R.drawable.conrad_bali,
        R.drawable.the_ayodya_palace,
        R.drawable.grand_hyatt_bali,
        R.drawable.courtyard_by_marriott_nusadua,
        R.drawable.amaterra_villas_nusadua,
        R.drawable.uppala_villa_nusadua,
        R.drawable.nusa_dua_beach_hotel,
        R.drawable.the_laguna_luxury_collection,
        R.drawable.dng_villas_nusadua,
        R.drawable.sadara_boutique_resort,
        R.drawable.the_royal_santrian,
        R.drawable.the_miracle_villa,
        R.drawable.sol_by_melia_benoa,
        R.drawable.the_westin_resort_nusadua,
        R.drawable.novotel_bali_benoa,
        R.drawable.mulia_villas
    )

    private var hotelDetail = arrayOf(
        "Melia Bali features 5 restaurants, a large lagoon swimming pool and a tropical landscaped garden. Located along the shores of Nusa Dua Beach, the hotel is a 5-minute walk from Bali Collection Shopping Centre.",
        "Situated along the beachfront Nusa Dua, a 15-minute walk from Bali Collection, INAYA Putri Bali offers modern and elegant accommodation with free in-room WiFi access. It features an outdoor pool.",
        "Ayodya Resort Bali is located along the white sands of Nusa Dua Beach. Offering comfortable accommodation with beautiful views, it features a 300 m private beachfront and a large outdoor pool. The resort has a garden and features a children's playground.",
        "Surrounded by lush greenery overlooking the ocean, The Apurva Kempinski Bali offers luxurious stays in Nusa Dua. Boasting a 60 m outdoor swimming pool, the resort also houses a spa. Free parking and free WiFi are provided.",
        "Amnaya Resort Benoa features a restaurant, free bikes, an outdoor swimming pool and fitness centre in Nusa Dua. Less than 1 km from Tanjung Benoa and 3 km from Bali Nusa Dua Convention Center, the property features a bar and a garden. The accommodation offers a 24-hour front desk, airport transfers, room service and free WiFi.",
        "Perched on a cliff overlooking the Indian Ocean, Nusa Dua’s Hilton Bali Resort features a secluded white sandy beach area. The resort features 4 outdoor connecting pools, free WiFi and free parking.",
        "Directly on the beachfront of Nusa Dua, The St. Regis Bali Resort is a property featuring a full spa and an outdoor lagoon pool. A free two-way airport shuttle with a limousine is provided. Free WiFi is provided throughout the resort and in the rooms.",
        "This 4-star Balinese resort features 2 large lagoon pools and a free shuttle to Geger Beach and Bali Collection Shopping Centre. It also houses a day spa and a buffet restaurant.",
        "Featuring a direct access to white sandy beach, Samabe Bali Suites & Villas is set a 15-minute drive from Nusa Dua. Providing free WiFi access in all areas, the resort boasts an outdoor pool, a spa centre and a gym. Guests enjoy daily breakfast, afternoon tea, free flow of non-alcoholic drinks and daily replenished minibar.",
        "Conrad Bali is a beachfront resort with access to the white sandy beach and various dining options. Its enormous outdoor pool is open to guests 24 hours. It offers free WiFi and free shuttle bus services to Bali Collection's shopping.",
        "Nestled among tropical gardens, The Ayodya Palace offers a beachfront resort in Nusa Dua. It boasts a private beach area, a large free-form swimming pool and 5 dining outlets. Guests can workout at the fitness centre or request pampering massages at the spa centre.",
        "Located in Nusa Dua, Grand Hyatt Bali offers spacious rooms with private balconies. It features 5 outdoor pools, a well-appointed spa and 8 dining options. Free parking is provided.",
        "Featuring a large landscaped lagoon pool bordered by sun loungers, the 5-star Courtyard by Mariott Bali Nusa Dua Resort houses 24/7 fitness facilities, a beach club and 5 dining venues. Free WiFi is accessible in all areas. Guests can stroll for 15 minutes or take the 3-minute complimentary shuttle ride to reach the white sandy Nusa Dua Beach.",
        "Amarterra Villas Bali Nusa Dua - MGallery Collection features spacious villas with a private pool and free WiFi throughout. Only a 3-minute walk to Nusa Dua Beach, the property also offers a fitness centre and a restaurant.",
        "With garden views, Uppala Villa Nusa Dua is located in Nusa Dua and has a restaurant, a 24-hour front desk, bar, garden, outdoor pool and terrace. Both WiFi and private parking are available at the villa free of charge.",
        "Set in lush tropical gardens, the 5-star Nusa Dua Beach Hotel & Spa, Bali features 3 outdoor pools and a private beach. Designed to resemble a Balinese palace, it offers several daily activities, including free scuba diving lessons, aqua aerobics and Balinese dance classes. Built in 1983, the property is within 800 m of Bali Collection. Free WiFi is accessible throughout the property.",
        "Bordered by a white sandy beach, The Laguna features 7 large lagoon swimming pools and stunning views of the Indian Ocean. Set amid landscaped tropical gardens, it offers spacious accommodation with around-the-clock, on-call butler service.",
        "Located 100 m from the beach, D&G Villas Nusa Dua offers accommodation with free WiFi access and a private pool. A video projector with a screen is provided. Guests can lounge on the sun beds or in the gazebo next to the pool. Dining options can be found in the surrounding areas.",
        "Located on Tanjung Benoa Beach, Sadara Boutique Beach Resort offers an outdoor pool and a beachfront restaurant. Rooms offer ocean views and feature a private balcony overlooking the tropical garden.",
        "Located along the shores of Nusa Dua Beach, The Royal Santrian offers free shuttle services and free Wi-Fi. A 5-minute drive from Bali Collection Shopping Mall and the water sport area, it features a sea-view restaurant, a poolside bar and villas with private pools. Guests can also enjoy daily afternoon tea, free minibar restock with soft drinks, juices, and beers, as well as free shuttle service to Nusa Dua and Tanjung Benoa areas.",
        "Located 2.7 km from Gunung Payung Beach, The Miracle Villa Nusa Dua provides accommodation with a restaurant, a garden and a 24-hour front desk for your convenience. The accommodation features a hot tub.",
        "Boasting seaside accommodation along Tanjung Benoa Beach, SOL by Meliá Benoa Bali All inclusive is nestled within tropical gardens. It offers a spectacular freeform pool, a luxurious spa menu and memorable dining possibilities on the private beach.",
        "The Westin Resort Nusa Dua Bali is located right on the white sandy beach of Nusa Dua and a 5-minute drive from Bali Collection Shopping Gallery. It offers 5-star luxury with 7 dining options, a spa and 5 outdoor pools. Free parking on site and free WiFi in all areas.",
        "Novotel Bali Benoa sits on the edge of Tanjung Benoa, overlooking Tanjung Benoa Beach. This Balinese-style hotel features 3 pools with 2 whirlpools. WiFi is accessible for free in guestrooms and public areas.",
        "Situated on the stunning coastline of Nusa Dua, Mulia Villas offers a private stay with breathtaking views of the surrounding landscapes. Guests can indulge in a soothing massage at the spa or enjoy a refreshing dip in the private hydrotherapy pool."
    )

    private var hotelRoomName1 = arrayOf(
        "Lagoon Access Junior Suite",
        "Deluxe Double or Twin",
        "Deluxe Double or Twin Room",
        "Grand Deluxe Room",
        "Deluxe Double of Twin Room",
        "Twin Guest Room with Garden View",
        "1 King Bed",
        "One-Bedroom St Regis Pool Suite with Complimentary Airport Transfer",
        "Superior Double or Twin Room with Pool View",
        "One-Bedroom Ocean View Family Suite with Free Benefit",
        "Deluxe Garden Twin Room",
        "Ayodya Palace Garden View with Club Benefits",
        "1 King Bed",
        "Deluxe Double Room with Balcony & Garden View",
        "One Bedroom Villa with Private Pool",
        "Deluxe One-Bedroom Villa with Pool",
        "Deluxe Double or Twin Room",
        "Deluxe Twin Room with Balcony and Garden View",
        "Three-Bedroom Villa with Private Pool",
        "Early Booker Hot Deal at Sadara Classic Room with Free Benefit",
        "Royal One-Bedroom Villa with Private Pool",
        "One-Bedroom Villa",
        "SOL Double Room",
        "Deluxe Double Garden View",
        "Deluxe Double Room",
        "One-Bedroom Villa with Garden View"
    )

    private var hotelRoomPrice1 = arrayOf(
        1865423,
        1468800,
        1739599,
        3875630,
        990000,
        1293188,
        2021992,
        10890000,
        565250,
        6613117,
        1497375,
        4221538,
        2021992,
        846988,
        3678400,
        2497500,
        1900011,
        1936000,
        3024000,
        1504000,
        15151500,
        1575000,
        1000000,
        2008600,
        980100,
        10218208
    )

    private var hotelRoomDetail1 = arrayOf(
        "This air-conditioned room has direct access to the lagoon pool. The room includes a living room with sofa, a flat-screen satellite TV, a minibar, a personal safe, a working desk. An en-suite bathroom with bathtub, shower, towels, slippers, and free toiletries.",
        "This air-conditioned twin/double room has a flat-screen satellite TV, seating area and a personal safe. En suite bathroom comes with a shower, bathtub and free toiletries. Guests can enjoy views of the lush garden from the room. ",
        "This spacious and deluxe room is designed in traditional Balinese decor with private balcony overlooking tropical gardens and/or the Indian Ocean. ",
        "Elegantly furnished, this air-conditioned room comes with a flat-screen TV and garden view. The en suite bathroom has separate bath and shower.",
        "45 m², Balcony, Garden view, Air conditioning, Ensuite bathroom, Flat-screen TV, Soundproofing, Minibar, Free WiFi",
        "Suitable for up to 3 adults or 2 adults and 2 children, this 48-sqm and air-conditioned room boasts garden view from the balcony. There is a flat-screen TV with cable channels. An electric kettle and a personal safe are provided. En suite bathroom comes with a shower and a bath. Extras include bathrobes, slippers, and free toiletries. ",
        "Overlooking tropical gardens and a lagoon, this 49-sqm room features teakwood furniture and marble floors. The air-conditioned room is fitted with cable TV, a personal safe and minibar. En suite bathroom comes with a bath, a separate shower and luxurious amenities with batik robes and slippers. Guests enjoy complimentary Internet access.",
        "This double room has a sofa, tea/coffee maker and soundproofing. ",
        "35 m², Balcony, Pool view, Air conditioning, Patio, Ensuite bathroom, Flat-screen TV, Minibar, Free WiFi, Free toiletries, Safety deposit box, Toilet Bath or shower",
        "This spacious family suite is located right in front of the beach. Offering a panoramic view of the ocean, it boasts a separate living area and a balcony with seating and dining area. ",
        "This triple room features a balcony, air conditioning and tea/coffee maker",
        "Offering views of the tropical garden, this suite has a seating area, a balcony and a private bathroom. It's fitted with a flat-screen TV, a personal safe and a minibar.",
        "Overlooking tropical gardens and a lagoon, this 49-sqm room features teakwood furniture and marble floors. The air-conditioned room is fitted with cable TV, a personal safe and minibar. En suite bathroom comes with a bath, a separate shower and luxurious amenities with batik robes and slippers. Guests enjoy complimentary Internet access",
        "This spacious room features 2 double beds and a private balcony with garden view. ",
        "This villa features a private pool, dining and seating areas. Air-conditioned bedrooms include a flat-screen satellite TV, a wardrobe, and a minibar. The private bathroom comes with a shower, a bathtub and free toiletries. ",
        "This villa has a balcony, flat-screen TV and stovetop. ",
        "Fitted with wooden furnishings, this Deluxe Room is decorated with warm-tone linens and draperies. It comes with modern amenities such as air conditioning, a flat-screen TV, and an electric kettle. The private bathroom offers shower facilities, a hairdryer, bathrobes, slippers, and free toiletries. Guests enjoy a private balcony or terrace with a seating area. ",
        "These air-conditioned deluxe rooms overlook the tropical gardens from a private balcony. The spacious rooms include a sofa, a flat-screen satellite TV, a minibar, a personal safe, a working desk, and an en-suite bathroom with fresh towels, cotton bathrobes and slippers, and other luxurious toiletries. ",
        "This three-bedroom villa features a gazebo next to its private pool. It has a well equipped kitchen, dining area and a living room with sofas. A video projector and a screen are provided. Each bedroom includes a flat-screen satellite TV, personal safe and a private bathroom with bath or shower facilities. ",
        "Featuring Balinese architecture, this twin/double room has a balcony, minibar and electric kettle. En suite bathroom is stocked with a hairdryer, slippers and free toiletries. ",
        "This one-bedroom villa features a private pool, gazebo with a large daybed, and a hot tub overlooking the ocean. It also has luxuriously appointed indoor and outdoor bathrooms. ",
        "200 m², Balcony, Sea view, Garden view, Pool view, Air conditioning, Patio, Private bathroom, Flat-screen TV, Soundproofing, Private pool",
        "Large double room features a flat-screen TV and a private balcony with market view. ",
        "This double room features air conditioning, bathrobe and seating area. ",
        "Featuring coconut wood furnishings, this air-conditioned room is equipped with a satellite TV, coffee/tea maker and a fridge. Guests can relax on the private balcony overlooking the garden. En suite bathroom has rainshower and free toiletries. ",
        "Overlooking the garden, this spacious villa is suitable for up to 2 guests. It features a private pool, pavilion and a hot tub. En suite bathroom has a shower, bathtub and a complete set of free toiletries."
    )

    private var hotelRoomName2 = arrayOf(
        "Family Suite",
        "Deluxe Double or Twin Room with Pool Access",
        "Grande Double or Twin Room",
        "Grand Deluxe Ocean Court Room",
        "Amnaya Double or Twin Room",
        "King Guest Room with Garden View",
        "1 King Bed Ocean View",
        "St Regis Twin Pool Suite with Complimentary Airport Transfer",
        "Premier Double or Twin Room with Pool View",
        "Samabe One-Bedroom Ocean View Suite with Free Benefit",
        "Accessible Deluxe King Room with Lagoon View",
        "Ayodya Palace Sea View with Club Benefits",
        "1 King Bed Ocean View",
        "Deluxe King Room with Balcony & Garden View",
        "Two Bedroom Villa with Private Pool",
        "Deluxe Two-Bedroom Villa with Pool",
        "Deluxe Plus Double or Twin Room",
        "Deluxe King Room with Balcony and Lagoon View",
        "Deluxe King or Twin Room",
        "Sadara Premier Room with Free Benefit",
        "Two-Bedroom Villa",
        "SOL Junior Suite",
        "Deluxe King Pool View",
        "Deluxe King Room - Pool Side",
        "Villa with Sea View"
    )

    private var hotelRoomPrice2 = arrayOf(
        2040170,
        1836000,
        2029999,
        4238630,
        1138500,
        2546212,
        10890000,
        692750,
        6613117,
        1751475,
        4729738,
        2546212,
        1210000,
        7308400,
        2700000,
        2032004,
        2117500,
        1780520,
        1584000,
        1850000,
        1995000,
        1466893,
        219011,
        1030101,
        12674508
    )

    private var hotelRoomDetail2 = arrayOf(
        "Top-floor split-level room has 2 bedrooms and a private balcony overlooking the landscaped gardens. ",
        "Featuring direct access to the shared deluxe pool, this air-conditioned twin/double room has a flat-screen satellite TV, seating area and a personal safe. En suite bathroom comes with a shower, bathtub and free toiletries.",
        "This spacious room is elegantly designed with teak parquet floors and overlooks the garden, lagoon and pool. ",
        "Well-appointed with wooden furniture, this air-conditioned room features a balcony and coffee/tea making facilities. The en suite bathroom includes a bath and a shower. ",
        "45 m², Balcony, Garden view, Air conditioning, Ensuite bathroom, Flat-screen TV, Soundproofing, Minibar, Free WiFi, Free toiletries, Safety deposit box, Bidet, Toilet Bath or shower, Towels, Linen",
        "Suitable for up to 3 adults or 2 adults and 2 children, this 48-sqm and air-conditioned room boasts garden view from the balcony. There is a flat-screen TV with cable channels. An electric kettle and a personal safe are provided. En suite bathroom comes with a shower and a bath. Extras include bathrobes, slippers, and free toiletries. ",
        "Overlooking the Indian Ocean, this 49-sqm room features teakwood furniture and marble floors. The air-conditioned room is fitted with cable TV, a personal safe and minibar. En suite bathroom comes with a marble bath, a separate shower and luxurious amenities with batik robes and slippers. ",
        "This double room features a seating area, CD player and electric kettle. ",
        "45 m² Balcony Pool view Air conditioning Patio Ensuite bathroom Flat-screen TV Minibar Free WiFi",
        "Spacious suite features a dining area, dressing room and a spacious living area. This suite comes with a private balcony overlooking the sea. En suite bathroom has a bathtub and a complete set of free bath amenities. ",
        "This spacious double room comes with a king-sized bed and guests can enjoy views of the lush garden. This room also has accessibility features, private terrace or balcony, and an en suite bathroom with separate bath and shower facilities.",
        "Offering views of the sea, this suite has a seating area, a balcony and a private bathroom. It's fitted with a flat-screen TV, a personal safe and a minibar.",
        "Overlooking the Indian Ocean, this 49-sqm room features teakwood furniture and marble floors. The air-conditioned room is fitted with cable TV, a personal safe and minibar. En suite bathroom comes with a marble bath, a separate shower and luxurious amenities with batik robes and slippers. ",
        "Spacious modern room with a private balcony overlooking the lush garden. ",
        "This spacious villa features a private pool, dining and seating areas. Air-conditioned bedrooms include a flat-screen satellite TV, a wardrobe, and a minibar. The private bathroom comes with a shower, a bathtub and free toiletries. ",
        " This villa features a balcony, dining area and stovetop, 200 m² Balcony, Sea view, Garden view, City view, Air conditioning, Patio",
        "This air-conditioned room features a private balcony with sliding doors that open up to views of the garden. The room is fitted with wooden flooring and is equipped with air conditioning, a desk, and a flat-screen satellite TV. The en suite bathroom has a full-size bathtub and comes with free bath amenities. ",
        "These air-conditioned deluxe rooms overlook the blue turquoise lagoons from a private balcony. These spacious rooms include a sofa, a flat-screen satellite TV, a minibar, a personal safe, a working desk, and an en-suite bathroom with fresh towels, cotton bathrobes and slippers, and other luxurious toiletries.",
        "No Room Description",
        "This modernly designed twin/double room features a satellite TV, a personal safe and an electric kettle. The room comes with a balcony or a terrace with garden view or partial sea view. ",
        "200 m², Balcony, Sea view, Garden view, Pool view, Air conditioning, Patio, Private bathroom, Flat-screen TV, Soundproofing, Private pool, Terrace, Free WiFi",
        "Spacious suite features a 32-inch flat-screen TV, a guest toilet and a spacious private balcony with market view. ",
        "This double room has air conditioning, seating area and bathrobe. ",
        "Featuring coconut wood furnishings, this air-conditioned room is equipped with a satellite TV, coffee/tea maker and a fridge. Guests can relax on the private balcony overlooking the pool. En suite bathroom has rainshower and free toiletries. ",
        "1 extra-large double bed, 505 m², Sea view, Pool with, a view Bath Air conditioning, Patio, Private bathroom, Flat-screen, TV, Private pool, Barbecue Terrace Minibar"
    )

    private var hotelRoomName3 = arrayOf(
        "The Level Junior Suite",
        "Suite with Garden View",
        "Ayodya Palace with Royal Benefits",
        "Grand Deluxe Lagoon Room",
        "Double or Twin Room",
        "Twin Cliff Tower Pool View",
        "1 King Bed Club Access",
        "One-Bedroom Gardenia Private Pool Villa with Complimentary Airport Transfer",
        "Laguna King Room with Pool Access",
        "One-Bedroom Ocean View Honeymoon Suite with Free Benefit",
        "Deluxe Lagoon King Room",
        "Mandavi Suite with Club Benefits",
        "1 King Bed Club Access",
        "Premium Deluxe King Room with Balcony",
        "Double or Twin Room",
        "Double or Twin Room",
        "Premier Double or Twin Room",
        "Deluxe King Studio wit Balcony",
        "Double or Twin Room",
        "Sadara Classic Room with Free Benefit",
        "Double or Twin Room",
        "Three-Bedroom Villa",
        "SOL Double Room - All Inclusive Package",
        "Premium King Room with Garden View",
        "Tropical Terrace King Room"
    )

    private var hotelRoomPrice3 = arrayOf(
        2506570,
        2914650,
        6030769,
        4601630,
        1200500,
        1429312,
        2995543,
        15475037,
        905250,
        7603628,
        1751475,
        9152769,
        2995543,
        1548800,
        1360000,
        1640000,
        2163100,
        2247143,
        2100400,
        1880000,
        3100500,
        2325000,
        2641201,
        2541000,
        1145100
    )

    private var hotelRoomDetail3 = arrayOf(
        "These air-conditioned rooms overlook the tropical gardens from a private balcony. This spacious rooms include living room with sofa, a flat-screen satellite TV, a minibar, a personal safe, a working desk. An en-suite bathroom with bathtub, shower, bathrobes, towels, slippers, and free toiletries. ",
        "Boasting Balinese contemporary decor, this suite has private terrace/balcony overlooking the gardens. It also has a living area, all-day tea/coffee, 24-hour butler service and pillow menu. ",
        "Overlooking the tropical garden, this spacious room features a minibar and an extensive range of bath amenities. ",
        "Featuring direct lagoon pool access, this contemporary room is fitted with a terrace and a flat-screen TV. The en suite bathroom comes with free toiletries. ",
        "No Room Description",
        "Suitable for up to 3 adults or 2 adults and 2 children, this 48-sqm and air-conditioned room boasts ocean view from the balcony. There is a flat-screen TV with cable channels.",
        "Overlooking tropical gardens and a lagoon, this 49-sqm room features teakwood furniture and marble floors. The air-conditioned room is fitted with cable TV, a personal safe and minibar. En suite bathroom comes with a bath, a separate shower and luxurious amenities with batik robes and slippers. Guests enjoy complimentary Internet access and Grand Club privileges. ",
        "This double room has a dining area, CD player and tea/coffee maker. ",
        "45 m² Balcony Pool view Air conditioning Patio Ensuite bathroom Flat-screen TV Private pool Minibar Free WiFi, Prices are per room, Included: 10 % Tax, 10 % Property service charge",
        "This honeymoon suite offers an uninterrupted view of the Indian Ocean from the spacious balcony with seating area. Guests can also enjoy a romantic bath in the glass-surround en suite bathroom which also offers a panoramic view of the sea. ",
        "This triple room has a balcony, satellite TV and electric kettle. ",
        "Boasting extra space and a private pool, this suite has a seating area, a balcony and a private bathroom. It's fitted with a flat-screen cable TV, a personal safe and a minibar. ",
        "Overlooking tropical gardens and a lagoon, this 49-sqm room features teakwood furniture and marble floors. The air-conditioned room is fitted with cable TV, a personal safe and minibar. En suite bathroom comes with a bath, a separate shower and luxurious amenities with batik robes and slippers. Guests enjoy complimentary Internet access and Grand Club privileges. ",
        "This premium deluxe room has a private balcony for an added privacy and a private bathroom with a bathtub. ",
        "No Room Description",
        "No Room Description",
        "Fitted with wooden furnishings, this Premier Room is decorated with warm-tone linens and draperies. It comes with modern amenities such as air conditioning, a flat-screen TV, and an electric kettle. The private bathroom offers a large bathtub, shower facilities, a hairdryer, bathrobes, slippers, and free toiletries. Guests enjoy a private balcony or terrace with a seating area. ",
        "These air-conditioned studio rooms overlook the tropical gardens or turquoise lagoons from a private balcony. The spacious rooms include a sofa, a flat-screen satellite TV, a minibar, a personal safe, a working desk, a living room and an en-suite bathroom with fresh towels, cotton bathrobes and slippers, and other luxurious toiletries. ",
        "No Room Description",
        "Featuring Balinese architecture, this twin/double room has a balcony, minibar and electric kettle. En suite bathroom is stocked with a hairdryer, slippers and free toiletries.",
        "No Room Description",
        "220 m², Balcony, Sea view, Garden view, Pool view, Air conditioning, Patio, Private bathroom, Flat-screen TV, Soundproofing, Private pool, Terrace, Minibar, Free WiFi",
        "Large double room features a flat-screen TV and a private balcony. ",
        "This double room has a seating area, bathrobe and air conditioning. ",
        "Room features a bathroom with separate bath and rain shower, private garden and terrace. "
    )

    private var roomPics1 = arrayOf(
        R.drawable.meliabali1,
        R.drawable.inaya1,
        R.drawable.ayodyaresort1,
        R.drawable.kempinski1,
        R.drawable.amnaya1,
        R.drawable.hiltonbali1,
        R.drawable.stregis1,
        R.drawable.swissbel1,
        R.drawable.samabe1,
        R.drawable.conrad1,
        R.drawable.ayodya_palace1,
        R.drawable.hyatt1,
        R.drawable.courtyard1,
        R.drawable.amarterra1,
        R.drawable.upalla1,
        R.drawable.nusaduabeach1,
        R.drawable.laguna1,
        R.drawable.dng1,
        R.drawable.sadara1,
        R.drawable.santrian1,
        R.drawable.miracle1,
        R.drawable.solbenoa1,
        R.drawable.westin1,
        R.drawable.novotel1,
        R.drawable.mulia1
    )

    private var roomPics2 = arrayOf(
        R.drawable.meliabali2,
        R.drawable.inaya2,
        R.drawable.ayodyaresort2,
        R.drawable.kempinski2,
        R.drawable.amnaya2,
        R.drawable.hiltonbali2,
        R.drawable.stregis2,
        R.drawable.swissbel2,
        R.drawable.samabe2,
        R.drawable.conrad2,
        R.drawable.ayodya_palace2,
        R.drawable.hyatt2,
        R.drawable.courtyard2,
        R.drawable.amarterra2,
        R.drawable.upalla2,
        R.drawable.nusaduabeach2,
        R.drawable.laguna2,
        R.drawable.dng2,
        R.drawable.sadara2,
        R.drawable.santrian2,
        R.drawable.miracle2,
        R.drawable.solbenoa2,
        R.drawable.westin2,
        R.drawable.novotel2,
        R.drawable.mulia2
    )

    private var roomPics3 = arrayOf(
        R.drawable.meliabali3,
        R.drawable.inaya3,
        R.drawable.ayodyaresort3,
        R.drawable.kempinski3,
        R.drawable.amnaya3,
        R.drawable.hiltonbali3,
        R.drawable.stregis3,
        R.drawable.swissbel3,
        R.drawable.samabe3,
        R.drawable.conrad3,
        R.drawable.ayodya_palace3,
        R.drawable.hyatt3,
        R.drawable.courtyard3,
        R.drawable.amarterra3,
        R.drawable.upalla3,
        R.drawable.nusaduabeach3,
        R.drawable.laguna3,
        R.drawable.dng3,
        R.drawable.sadara3,
        R.drawable.santrian3,
        R.drawable.miracle3,
        R.drawable.solbenoa3,
        R.drawable.westin3,
        R.drawable.novotel3,
        R.drawable.mulia3
    )

    private var roomPics4 = arrayOf(
        R.drawable.meliabali4,
        R.drawable.inaya4,
        R.drawable.ayodyaresort4,
        R.drawable.kempinski4,
        R.drawable.amnaya4,
        R.drawable.hiltonbali4,
        R.drawable.stregis4,
        R.drawable.swissbel4,
        R.drawable.samabe4,
        R.drawable.conrad4,
        R.drawable.ayodya_palace4,
        R.drawable.hyatt4,
        R.drawable.courtyard4,
        R.drawable.amarterra4,
        R.drawable.upalla4,
        R.drawable.nusaduabeach4,
        R.drawable.laguna4,
        R.drawable.dng4,
        R.drawable.sadara4,
        R.drawable.santrian4,
        R.drawable.miracle4,
        R.drawable.solbenoa4,
        R.drawable.westin4,
        R.drawable.novotel4,
        R.drawable.mulia4
    )

    private var roomPics5 = arrayOf(
        R.drawable.meliabali5,
        R.drawable.inaya5,
        R.drawable.ayodyaresort5,
        R.drawable.kempinski5,
        R.drawable.amnaya5,
        R.drawable.hiltonbali5,
        R.drawable.stregis5,
        R.drawable.swissbel5,
        R.drawable.samabe5,
        R.drawable.conrad5,
        R.drawable.ayodya_palace5,
        R.drawable.hyatt5,
        R.drawable.courtyard5,
        R.drawable.amarterra5,
        R.drawable.upalla5,
        R.drawable.nusaduabeach5,
        R.drawable.laguna5,
        R.drawable.dng5,
        R.drawable.sadara5,
        R.drawable.santrian5,
        R.drawable.miracle5,
        R.drawable.solbenoa5,
        R.drawable.westin5,
        R.drawable.novotel5,
        R.drawable.mulia5
    )

    val listDataHotel: ArrayList<Hotel>
        get() {
            val list = arrayListOf<Hotel>()
            for (position in hotelName.indices) {
                val hotelData = Hotel()
                hotelData.name = hotelName[position]
                hotelData.starRating = starRating[position]
                hotelData.price = price[position]
                hotelData.photo = hotelPhoto[position]
                hotelData.detail = hotelDetail[position]
                hotelData.roomName1 = hotelRoomName1[position]
                hotelData.roomPrice1 = hotelRoomPrice1[position]
                hotelData.roomDetail1 = hotelRoomDetail1[position]
                hotelData.roomName2 = hotelRoomName2[position]
                hotelData.roomPrice2 = hotelRoomPrice2[position]
                hotelData.roomDetail2 = hotelRoomDetail2[position]
                hotelData.roomName3 = hotelRoomName3[position]
                hotelData.roomPrice3 = hotelRoomPrice3[position]
                hotelData.roomDetail3 = hotelRoomDetail3[position]
                hotelData.roomPhoto1 = roomPics1[position]
                hotelData.roomPhoto2 = roomPics2[position]
                hotelData.roomPhoto3 = roomPics3[position]
                hotelData.roomPhoto4 = roomPics4[position]
                hotelData.roomPhoto5 = roomPics5[position]
                list.add(hotelData)
            }
            return list
        }
}