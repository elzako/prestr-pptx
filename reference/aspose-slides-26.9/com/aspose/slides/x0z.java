package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;

class x0z implements c5j {
   @Override
   public final Dictionary<String, byte[]> n5(XamlOptions var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1.a6())) {
         String var23 = com.aspose.slides.ms.System.d1.n5(
            "You should to set  in the '{0}' class a required parameter '{1}'!",new Object[]{ "XamlOptions", "xamlOptions.SolutionName"
         });
         throw new t1c(var23);
      }

      if (com.aspose.slides.ms.System.d1.n5(var1.u9())) {
         String var22 = com.aspose.slides.ms.System.d1.n5(
            "You should to set  in the '{0}' class a required parameter '{1}'!",new Object[]{ "XamlOptions", "xamlOptions.ProjectName"
         });
         throw new t1c(var22);
      }

      try {
         Dictionary var2 = new Dictionary();
         String var24 = var1.a6();
         com.aspose.slides.ms.System.o0 var4 = com.aspose.slides.ms.System.o0.l6().k5();
         com.aspose.slides.ms.System.o0 var5 = com.aspose.slides.ms.System.o0.l6().k5();
         com.aspose.slides.ms.System.o0 var6 = com.aspose.slides.ms.System.o0.l6().k5();
         KeyValuePair var7 = this.n5(var24, var4.k5(), var5.k5(), var6.k5(), "{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}", var1).Clone();
         var2.addItem(var7.getKey(), var7.getValue());
         String var8 = com.aspose.slides.internal.z0k.z1.l6(var24, var1.u9());
         String var9 = com.aspose.slides.internal.z0k.z1.l6(var8, var1.u9());
         String var10 = com.aspose.slides.internal.z0k.z1.n5(var1.z1());
         KeyValuePair var11 = this.l6(var9).Clone();
         var2.addItem(var11.getKey(), var11.getValue());
         Dictionary var12 = this.l6(var9, var1.k5());
         p5g.n5(var12, var2);
         KeyValuePair var13 = this.n5(var9, var1.u9()).Clone();
         var2.addItem(var13.getKey(), var13.getValue());
         Dictionary var14 = this.n5(var9, var1.k5(), var1);
         p5g.n5(var14, var2);
         String var15 = com.aspose.slides.internal.z0k.z1.l6(var8, com.aspose.slides.ms.System.d1.n5(new String[]{var1.u9(), ".Android"}));
         KeyValuePair var16 = this.n5(var15).Clone();
         var2.addItem(var16.getKey(), var16.getValue());
         Dictionary var17 = this.l6(var15, var1);
         p5g.n5(var17, var2);
         Dictionary var18 = this.n5(var15, var1);
         p5g.n5(var18, var2);
         KeyValuePair var19 = this.n5(var15, var1.k5(), var1.u9()).Clone();
         var2.addItem(var19.getKey(), var19.getValue());
         KeyValuePair var20 = this.n5(var15, var5.k5(), var6.k5(), "{EFBA0AD7-5A72-4C68-AF49-83D382785DCF};{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}", var1)
            .Clone();
         var2.addItem(var20.getKey(), var20.getValue());
         return var2;
      } catch (ArgumentException var21) {
         String var3 = com.aspose.slides.ms.System.d1.n5("Error during save to new solution. Details: {0}", new Object[]{var21.getMessage()});
         throw new t1c(var3);
      }
   }

   private KeyValuePair<String, byte[]> n5(String var1, com.aspose.slides.ms.System.o0 var2, com.aspose.slides.ms.System.o0 var3, String var4, XamlOptions var5) {
      String var6 = com.aspose.slides.internal.z0k.z1.l6(var1, com.aspose.slides.ms.System.d1.n5(new String[]{var5.u9(), ".Android.csproj"}));
      String var7 = com.aspose.slides.ms.System.d1.n5;
      if (var5.c8()) {
         String var8 = "xamarinforms/templates/AndroidProject_csproj_Frames_Template.txt";
         var7 = x4q.l6(var8);
      } else {
         String var16 = "xamarinforms/templates/AndroidProject_csproj_Template.txt";
         var7 = x4q.l6(var16);
      }

      var7 = com.aspose.slides.ms.System.d1.n5(var7, "{ProjectGuid}", com.aspose.slides.ms.System.d1.n5(new String[]{"{", var3.toString(), "}"}));
      var7 = com.aspose.slides.ms.System.d1.n5(var7, "{Namespace}", var5.k5());
      var7 = com.aspose.slides.ms.System.d1.n5(var7, "{AssemblyName}", var5.u9());
      var7 = com.aspose.slides.ms.System.d1.n5(var7, "{ProjectName}", var5.u9());
      var7 = com.aspose.slides.ms.System.d1.n5(var7, "{BaseProjectGuid}", com.aspose.slides.ms.System.d1.n5(new String[]{"{", var2.toString(), "}"}));
      var7 = com.aspose.slides.ms.System.d1.n5(var7, "{ProjectTypeGuids}", var4);
      byte[] var17 = v7.n5(var7);
      return new KeyValuePair<>(var6, var17);
   }

   private KeyValuePair<String, byte[]> n5(String var1, String var2, String var3) {
      String var4 = com.aspose.slides.internal.z0k.z1.l6(var1, "MainActivity.cs");
      String var5 = "xamarinforms/templates/AndroidProject_MainActivity_cs_Template.txt";
      String var6 = x4q.l6(var5);
      var6 = com.aspose.slides.ms.System.d1.n5(var6, "{Namespace}", var2);
      var6 = com.aspose.slides.ms.System.d1.n5(var6, "{ProjectName}", var3);
      byte[] var7 = v7.n5(var6);
      return new KeyValuePair<>(var4, var7);
   }

   private Dictionary<String, byte[]> n5(String var1, XamlOptions var2) {
      Dictionary var3 = new Dictionary();
      String var4 = com.aspose.slides.internal.z0k.z1.l6(var1, "Resources");
      if (var2.c8()) {
         String var5 = com.aspose.slides.internal.z0k.z1.l6(var4, "drawable-hdpi");
         String var6 = com.aspose.slides.internal.z0k.z1.l6(var5, "ic_down.png");
         String var7 = "xamarinforms/drawable_hdpi/ic_down.png";
         byte[] var8 = x4q.n5(var7);
         var3.addItem(var6, var8);
         String var9 = com.aspose.slides.internal.z0k.z1.l6(var5, "ic_up.png");
         String var10 = "xamarinforms/drawable_hdpi/ic_up.png";
         byte[] var11 = x4q.n5(var10);
         var3.addItem(var9, var11);
         String var12 = com.aspose.slides.internal.z0k.z1.l6(var4, "drawable-mdpi");
         String var13 = com.aspose.slides.internal.z0k.z1.l6(var12, "ic_down.png");
         String var14 = "xamarinforms/drawable_mdpi/ic_down.png";
         byte[] var15 = x4q.n5(var14);
         var3.addItem(var13, var15);
         String var16 = com.aspose.slides.internal.z0k.z1.l6(var12, "ic_up.png");
         String var17 = "xamarinforms/drawable_mdpi/ic_up.png";
         byte[] var18 = x4q.n5(var17);
         var3.addItem(var16, var18);
         String var19 = com.aspose.slides.internal.z0k.z1.l6(var4, "drawable-xhdpi");
         String var20 = com.aspose.slides.internal.z0k.z1.l6(var19, "ic_down.png");
         String var21 = "xamarinforms/drawable_xhdpi/ic_down.png";
         byte[] var22 = x4q.n5(var21);
         var3.addItem(var20, var22);
         String var23 = com.aspose.slides.internal.z0k.z1.l6(var19, "ic_up.png");
         String var24 = "xamarinforms/drawable_xhdpi/ic_up.png";
         byte[] var25 = x4q.n5(var24);
         var3.addItem(var23, var25);
         String var26 = com.aspose.slides.internal.z0k.z1.l6(var4, "drawable-xxhdpi");
         String var27 = com.aspose.slides.internal.z0k.z1.l6(var26, "ic_down.png");
         String var28 = "xamarinforms/drawable_xxhdpi/ic_down.png";
         byte[] var29 = x4q.n5(var28);
         var3.addItem(var27, var29);
         String var30 = com.aspose.slides.internal.z0k.z1.l6(var26, "ic_up.png");
         String var31 = "xamarinforms/drawable_xxhdpi/ic_up.png";
         byte[] var32 = x4q.n5(var31);
         var3.addItem(var30, var32);
         String var33 = com.aspose.slides.internal.z0k.z1.l6(var4, "drawable-xxxhdpi");
         String var34 = com.aspose.slides.internal.z0k.z1.l6(var33, "ic_down.png");
         String var35 = "xamarinforms/drawable_xxxhdpi/ic_down.png";
         byte[] var36 = x4q.n5(var35);
         var3.addItem(var34, var36);
         String var37 = com.aspose.slides.internal.z0k.z1.l6(var33, "ic_up.png");
         String var38 = "xamarinforms/drawable_xxxhdpi/ic_up.png";
         byte[] var39 = x4q.n5(var38);
         var3.addItem(var37, var39);
      }

      String var62 = com.aspose.slides.internal.z0k.z1.l6(var4, "mipmap-anydpi-v26");
      String var63 = com.aspose.slides.internal.z0k.z1.l6(var62, "icon.xml");
      String var64 = "xamarinforms/templates/AndroidProject_Resources_mipmap_anydpi_v26_icon_xml_Template.txt";
      String var65 = x4q.l6(var64);
      byte[] var66 = v7.n5(var65);
      var3.addItem(var63, var66);
      String var67 = com.aspose.slides.internal.z0k.z1.l6(var62, "icon_round.xml");
      String var68 = "xamarinforms/templates/AndroidProject_Resources_mipmap_anydpi_v26_icon_round_xml_Template.txt";
      String var69 = x4q.l6(var68);
      byte[] var70 = v7.n5(var69);
      var3.addItem(var67, var70);
      String var71 = com.aspose.slides.internal.z0k.z1.l6(var4, "mipmap-hdpi");
      String var72 = com.aspose.slides.internal.z0k.z1.l6(var71, "icon.png");
      String var73 = "xamarinforms/mipmap_hdpi/icon.png";
      byte[] var74 = x4q.n5(var73);
      var3.addItem(var72, var74);
      String var75 = com.aspose.slides.internal.z0k.z1.l6(var71, "launcher_foreground.png");
      String var76 = "xamarinforms/mipmap_hdpi/launcher_foreground.png";
      byte[] var77 = x4q.n5(var76);
      var3.addItem(var75, var77);
      String var78 = com.aspose.slides.internal.z0k.z1.l6(var4, "mipmap-mdpi");
      String var79 = com.aspose.slides.internal.z0k.z1.l6(var78, "icon.png");
      String var80 = "xamarinforms/mipmap_mdpi/icon.png";
      byte[] var81 = x4q.n5(var80);
      var3.addItem(var79, var81);
      String var82 = com.aspose.slides.internal.z0k.z1.l6(var78, "launcher_foreground.png");
      String var83 = "xamarinforms/mipmap_mdpi/launcher_foreground.png";
      byte[] var84 = x4q.n5(var83);
      var3.addItem(var82, var84);
      String var85 = com.aspose.slides.internal.z0k.z1.l6(var4, "mipmap-xhdpi");
      String var86 = com.aspose.slides.internal.z0k.z1.l6(var85, "icon.png");
      String var87 = "xamarinforms/mipmap_xhdpi/icon.png";
      byte[] var88 = x4q.n5(var87);
      var3.addItem(var86, var88);
      String var89 = com.aspose.slides.internal.z0k.z1.l6(var85, "launcher_foreground.png");
      String var90 = "xamarinforms/mipmap_xhdpi/launcher_foreground.png";
      byte[] var91 = x4q.n5(var90);
      var3.addItem(var89, var91);
      String var92 = com.aspose.slides.internal.z0k.z1.l6(var4, "mipmap-xxhdpi");
      String var93 = com.aspose.slides.internal.z0k.z1.l6(var92, "icon.png");
      String var94 = "xamarinforms/mipmap_xxhdpi/icon.png";
      byte[] var95 = x4q.n5(var94);
      var3.addItem(var93, var95);
      String var96 = com.aspose.slides.internal.z0k.z1.l6(var92, "launcher_foreground.png");
      String var40 = "xamarinforms/mipmap_xxhdpi/launcher_foreground.png";
      byte[] var41 = x4q.n5(var40);
      var3.addItem(var96, var41);
      String var42 = com.aspose.slides.internal.z0k.z1.l6(var4, "mipmap-xxxhdpi");
      String var43 = com.aspose.slides.internal.z0k.z1.l6(var42, "icon.png");
      String var44 = "xamarinforms/mipmap_xxxhdpi/icon.png";
      byte[] var45 = x4q.n5(var44);
      var3.addItem(var43, var45);
      String var46 = com.aspose.slides.internal.z0k.z1.l6(var42, "launcher_foreground.png");
      String var47 = "xamarinforms/mipmap_xxxhdpi/launcher_foreground.png";
      byte[] var48 = x4q.n5(var47);
      var3.addItem(var46, var48);
      String var49 = com.aspose.slides.internal.z0k.z1.l6(var4, "values");
      String var50 = com.aspose.slides.internal.z0k.z1.l6(var49, "colors.xml");
      String var51 = "xamarinforms/templates/AndroidProject_Resources_values_colors_xml_Template.txt";
      String var52 = x4q.l6(var51);
      byte[] var53 = v7.n5(var52);
      var3.addItem(var50, var53);
      String var54 = com.aspose.slides.internal.z0k.z1.l6(var49, "styles.xml");
      String var55 = "xamarinforms/templates/AndroidProject_Resources_values_styles_xml_Template.txt";
      String var56 = x4q.l6(var55);
      byte[] var57 = v7.n5(var56);
      var3.addItem(var54, var57);
      String var58 = com.aspose.slides.internal.z0k.z1.l6(var4, "AboutResources.txt");
      String var59 = "xamarinforms/templates/AndroidProject_Resources_AboutResources_txt_Template.txt";
      String var60 = x4q.l6(var59);
      byte[] var61 = v7.n5(var60);
      var3.addItem(var58, var61);
      return var3;
   }

   private Dictionary<String, byte[]> l6(String var1, XamlOptions var2) {
      Dictionary var3 = new Dictionary();
      String var4 = com.aspose.slides.internal.z0k.z1.l6(var1, "Properties");
      String var5 = com.aspose.slides.internal.z0k.z1.l6(var4, "AndroidManifest.xml");
      String var6 = "xamarinforms/templates/AndroidProject_Properties_AndroidManifest_xml_Template.txt";
      String var7 = x4q.l6(var6);
      var7 = com.aspose.slides.ms.System.d1.n5(var7, "{ProjectNameLower}", com.aspose.slides.ms.System.d1.u9(var2.u9()));
      var7 = com.aspose.slides.ms.System.d1.n5(var7, "{ProjectName}", var2.u9());
      byte[] var8 = v7.n5(var7);
      var3.addItem(var5, var8);
      String var9 = com.aspose.slides.internal.z0k.z1.l6(var4, "AssemblyInfo.cs");
      String var10 = "xamarinforms/templates/AndroidProject_Properties_AssemblyInfo_cs_Template.txt";
      String var11 = x4q.l6(var10);
      var11 = com.aspose.slides.ms.System.d1.n5(var11, "{ProjectName}", var2.u9());
      byte[] var12 = v7.n5(var11);
      var3.addItem(var9, var12);
      return var3;
   }

   private KeyValuePair<String, byte[]> n5(String var1) {
      String var2 = com.aspose.slides.internal.z0k.z1.l6(var1, "Assets");
      String var3 = com.aspose.slides.internal.z0k.z1.l6(var2, "AboutAssets.txt");
      String var4 = "xamarinforms/templates/AndroidProject_AboutAssets_Template.txt";
      String var5 = x4q.l6(var4);
      byte[] var6 = v7.n5(var5);
      return new KeyValuePair<>(var3, var6);
   }

   private KeyValuePair<String, byte[]> n5(String var1, String var2) {
      String var3 = com.aspose.slides.internal.z0k.z1.l6(var1, com.aspose.slides.ms.System.d1.n5(new String[]{var2, ".csproj"}));
      String var4 = "xamarinforms/templates/BaseProject_csproj_Template.txt";
      String var5 = x4q.l6(var4);
      byte[] var6 = v7.n5(var5);
      return new KeyValuePair<>(var3, var6);
   }

   private Dictionary<String, byte[]> l6(String var1, String var2) {
      Dictionary var3 = new Dictionary();
      String var4 = com.aspose.slides.internal.z0k.z1.l6(var1, "App.xaml");
      String var5 = "xamarinforms/templates/BaseProject_App_xaml_Template.txt";
      String var6 = x4q.l6(var5);
      var6 = com.aspose.slides.ms.System.d1.n5(var6, "{Namespace}", var2);
      byte[] var7 = v7.n5(var6);
      var3.addItem(var4, var7);
      String var8 = com.aspose.slides.internal.z0k.z1.l6(var1, "App.xaml.cs");
      String var9 = "xamarinforms/templates/BaseProject_App_xaml_cs_Template.txt";
      String var10 = x4q.l6(var9);
      var10 = com.aspose.slides.ms.System.d1.n5(var10, "{Namespace}", var2);
      byte[] var11 = v7.n5(var10);
      var3.addItem(var8, var11);
      return var3;
   }

   private KeyValuePair<String, byte[]> l6(String var1) {
      String var2 = com.aspose.slides.internal.z0k.z1.l6(var1, "AssemblyInfo.cs");
      String var3 = "xamarinforms/templates/BaseProject_AssemblyInfo_cs_Template.txt";
      String var4 = x4q.l6(var3);
      byte[] var5 = v7.n5(var4);
      return new KeyValuePair<>(var2, var5);
   }

   private Dictionary<String, byte[]> n5(String var1, String var2, XamlOptions var3) {
      Dictionary var4 = new Dictionary();
      if (var3.c8()) {
         String var5 = com.aspose.slides.internal.z0k.z1.l6(var1, "MainPage.xaml");
         String var6 = "xamarinforms/templates/BaseProject_MainPage_xaml_Frames_Template.txt";
         String var7 = x4q.l6(var6);
         var7 = com.aspose.slides.ms.System.d1.n5(var7, "{Namespace}", var2);
         var7 = com.aspose.slides.ms.System.d1.n5(var7, "{Height}", com.aspose.slides.ms.System.n1.u9(var3.l6().k5()));
         var7 = com.aspose.slides.ms.System.d1.n5(var7, "{Width}", com.aspose.slides.ms.System.n1.u9(var3.l6().l6()));
         byte[] var8 = v7.n5(var7);
         var4.addItem(var5, var8);
         String var9 = com.aspose.slides.internal.z0k.z1.l6(var1, "MainPage.xaml.cs");
         String var10 = "xamarinforms/templates/BaseProject_MainPage_xaml_cs_Frames_Template.txt";
         String var11 = x4q.l6(var10);
         var11 = com.aspose.slides.ms.System.d1.n5(var11, "{Namespace}", var2);
         byte[] var12 = v7.n5(var11);
         var4.addItem(var9, var12);
      } else {
         String var13 = com.aspose.slides.internal.z0k.z1.l6(var1, "MainPage.xaml");
         String var14 = "xamarinforms/templates/BaseProject_MainPage_xaml_Template.txt";
         String var18 = x4q.l6(var14);
         var18 = com.aspose.slides.ms.System.d1.n5(var18, "{Namespace}", var2);
         byte[] var20 = v7.n5(var18);
         var4.addItem(var13, var20);
         String var21 = com.aspose.slides.internal.z0k.z1.l6(var1, "MainPage.xaml.cs");
         String var22 = "xamarinforms/templates/BaseProject_MainPage_xaml_cs_Template.txt";
         String var24 = x4q.l6(var22);
         var24 = com.aspose.slides.ms.System.d1.n5(var24, "{Namespace}", var2);
         byte[] var26 = v7.n5(var24);
         var4.addItem(var21, var26);
      }

      return var4;
   }

   private KeyValuePair<String, byte[]> n5(
      String var1, com.aspose.slides.ms.System.o0 var2, com.aspose.slides.ms.System.o0 var3, com.aspose.slides.ms.System.o0 var4, String var5, XamlOptions var6
   ) {
      String var7 = com.aspose.slides.internal.z0k.z1.l6(var1, com.aspose.slides.ms.System.d1.n5(new String[]{var6.a6(), ".sln"}));
      String var8 = "xamarinforms/templates/Solution_Template.txt";
      String var9 = x4q.l6(var8);
      var9 = com.aspose.slides.ms.System.d1.n5(var9, "{ProjectName}", var6.u9());
      var9 = com.aspose.slides.ms.System.d1.n5(var9, "{AndroidProjectGuid}", com.aspose.slides.ms.System.d1.n5(new String[]{"{", var4.toString(), "}"}));
      var9 = com.aspose.slides.ms.System.d1.n5(var9, "{BaseProjectGuid}", com.aspose.slides.ms.System.d1.n5(new String[]{"{", var3.toString(), "}"}));
      var9 = com.aspose.slides.ms.System.d1.n5(var9, "{SolutionGuid}", com.aspose.slides.ms.System.d1.n5(new String[]{"{", var2.toString(), "}"}));
      var9 = com.aspose.slides.ms.System.d1.n5(var9, "{ProjectTypeGuidString}", var5);
      byte[] var10 = v7.n5(var9);
      return new KeyValuePair<>(var7, var10);
   }
}
