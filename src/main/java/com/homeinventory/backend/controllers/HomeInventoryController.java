package com.homeinventory.backend.controllers;

import com.homeinventory.backend.models.InventoryItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("api/v1/home-inventory")
public class HomeInventoryController {

    InventoryItem item1 = new InventoryItem();
    InventoryItem item2 = new InventoryItem();
    InventoryItem item3= new InventoryItem();

    @GetMapping("")
    public List<InventoryItem> listRecipes(){

        List<InventoryItem> inventoryList = new ArrayList<>();

        this.item1.setId(Long.MIN_VALUE + 1);
        this.item1.setName("LG Household Refrigerator");
        this.item1.setModelNumber("LRFDS2016S /01");
        this.item1.setSerialNumber("111KRJU3M812");
        this.item1.setDescription("30 cu. ft. French Door Smart Refrigerator, Door-In-Door, Dual Ice Makers with Craft Ice, PrintProof Stainless Steel");

        this.item2.setId(Long.MIN_VALUE + 2);
        this.item2.setName("LG Front Load Washer");
        this.item2.setModelNumber("WM3600HWA /01");
        this.item2.setSerialNumber("012TNNH01927");
        this.item2.setDescription("4.5 cu. ft. Ultra Large Capacity Smart wi-fi Enabled Front Load Washer with Built-In Intelligence & Steam Technology");

        this.item3.setId(Long.MIN_VALUE + 3);
        this.item3.setName("LG Electric Dryer");
        this.item3.setModelNumber("DLEX3700W");
        this.item3.setSerialNumber("007KWGG2Y071");
        this.item3.setDescription("7.4 cu. ft. Ultra Large Capacity Smart wi-fi Enabled SteamDryer™");

        inventoryList.add(item1);
        inventoryList.add(item2);
        inventoryList.add(item3);

        return inventoryList;
    }

}
