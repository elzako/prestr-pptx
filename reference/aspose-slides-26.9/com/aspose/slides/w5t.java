package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;

class w5t implements c5j {
   @Override
   public final Dictionary<String, byte[]> n5(XamlOptions var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1.a6())) {
         String var16 = com.aspose.slides.ms.System.d1.n5("You should to set  in the '{0}' class a required parameter '{1}'!",new Object[]{ "XamlOptions", "SolutionName"});
         throw new t1c(var16);
      }

      if (com.aspose.slides.ms.System.d1.n5(var1.u9())) {
         String var15 = com.aspose.slides.ms.System.d1.n5("You should to set  in the '{0}' class a required parameter '{1}'!",new Object[]{ "XamlOptions", "ProjectName"});
         throw new t1c(var15);
      }

      try {
         Dictionary var2 = new Dictionary();
         String var17 = var1.a6();
         String var4 = com.aspose.slides.internal.z0k.z1.l6(var17, var1.u9());
         com.aspose.slides.ms.System.o0 var5 = com.aspose.slides.ms.System.o0.l6().k5();
         com.aspose.slides.ms.System.o0 var6 = com.aspose.slides.ms.System.o0.l6().k5();
         KeyValuePair var7 = this.n5(var17, var5.k5(), var6.k5(), "{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}", var1).Clone();
         var2.addItem(var7.getKey(), var7.getValue());
         Dictionary var8 = this.n5(var4, var1);
         p5g.n5(var8, var2);
         KeyValuePair var9 = this.n5(var4).Clone();
         var2.addItem(var9.getKey(), var9.getValue());
         Dictionary var10 = this.n5(var4, var1.k5());
         p5g.n5(var10, var2);
         KeyValuePair var11 = this.n5(var4, var6.k5(), "{60dc8134-eba5-43b8-bcc9-bb4bc16c2548};{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}", var1).Clone();
         var2.addItem(var11.getKey(), var11.getValue());
         if (var1.c8()) {
            Dictionary var12 = this.l6(var4, var1.k5(), var1);
            p5g.n5(var12, var2);
            Dictionary var13 = this.l6(var4);
            p5g.n5(var13, var2);
         } else {
            Dictionary var18 = this.n5(var4, var1.k5(), var1);
            p5g.n5(var18, var2);
         }

         return var2;
      } catch (ArgumentException var14) {
         String var3 = com.aspose.slides.ms.System.d1.n5("Error during save to new solution. Details: {0}", new Object[]{var14.getMessage()});
         throw new t1c(var3);
      }
   }

   private Dictionary<String, byte[]> n5(String var1, String var2, XamlOptions var3) {
      Dictionary var4 = new Dictionary();
      String var5 = com.aspose.slides.internal.z0k.z1.l6(var1, "MainWindow.xaml");
      String var6 = "wpftemplates/BaseProject_MainWindow_xaml_Default_Template.txt";
      String var7 = x4q.l6(var6);
      var7 = com.aspose.slides.ms.System.d1.n5(var7, "{Namespace}", var2);
      float var8 = var3.l6().k5() + 120.0F;
      var7 = com.aspose.slides.ms.System.d1.n5(var7, "{Height}", com.aspose.slides.ms.System.n1.u9(var8));
      var7 = com.aspose.slides.ms.System.d1.n5(var7, "{Width}", com.aspose.slides.ms.System.n1.u9(var3.l6().l6()));
      byte[] var9 = v7.n5(var7);
      var4.addItem(var5, var9);
      String var10 = com.aspose.slides.internal.z0k.z1.l6(var1, "MainWindow.xaml.cs");
      String var11 = "wpftemplates/BaseProject_MainWindow_xaml_cs_Template.txt";
      String var12 = x4q.l6(var11);
      var12 = com.aspose.slides.ms.System.d1.n5(var12, "{Namespace}", var2);
      byte[] var13 = v7.n5(var12);
      var4.addItem(var10, var13);
      return var4;
   }

   private Dictionary<String, byte[]> l6(String var1, String var2, XamlOptions var3) {
      Dictionary var4 = new Dictionary();
      String var5 = com.aspose.slides.internal.z0k.z1.l6(var1, "MainWindow.xaml");
      String var6 = "wpftemplates/BaseProject_MainWindow_xaml_Template.txt";
      String var7 = x4q.l6(var6);
      var7 = com.aspose.slides.ms.System.d1.n5(var7, "{Namespace}", var2);
      float var8 = var3.l6().k5() + 120.0F;
      var7 = com.aspose.slides.ms.System.d1.n5(var7, "{Height}", com.aspose.slides.ms.System.n1.u9(var8));
      var7 = com.aspose.slides.ms.System.d1.n5(var7, "{Width}", com.aspose.slides.ms.System.n1.u9(var3.l6().l6()));
      byte[] var9 = v7.n5(var7);
      var4.addItem(var5, var9);
      String var10 = com.aspose.slides.internal.z0k.z1.l6(var1, "MainWindow.xaml.cs");
      String var11 = "wpftemplates/BaseProject_MainWindow_xaml_cs_Frames_Template.txt";
      String var12 = x4q.l6(var11);
      var12 = com.aspose.slides.ms.System.d1.n5(var12, "{Namespace}", var2);
      byte[] var13 = v7.n5(var12);
      var4.addItem(var10, var13);
      return var4;
   }

   private KeyValuePair<String, byte[]> n5(String var1, com.aspose.slides.ms.System.o0 var2, String var3, XamlOptions var4) {
      String var5 = com.aspose.slides.internal.z0k.z1.l6(var1, com.aspose.slides.ms.System.d1.n5(new String[]{var4.u9(), ".csproj"}));
      String var6 = com.aspose.slides.ms.System.d1.n5;
      if (var4.c8()) {
         String var7 = "wpftemplates/BaseProject_csproj_Frames_Template.txt";
         var6 = x4q.l6(var7);
      } else {
         String var13 = "wpftemplates/BaseProject_csproj_Template.txt";
         var6 = x4q.l6(var13);
      }

      var6 = com.aspose.slides.ms.System.d1.n5(var6, "{ProjectGuid}", com.aspose.slides.ms.System.d1.n5(new String[]{"{", var2.toString(), "}"}));
      var6 = com.aspose.slides.ms.System.d1.n5(var6, "{Namespace}", var4.k5());
      var6 = com.aspose.slides.ms.System.d1.n5(var6, "{AssemblyName}", var4.u9());
      var6 = com.aspose.slides.ms.System.d1.n5(var6, "{ProjectTypeGuids}", var3);
      byte[] var14 = v7.n5(var6);
      return new KeyValuePair<>(var5, var14);
   }

   private Dictionary<String, byte[]> n5(String var1, String var2) {
      Dictionary var3 = new Dictionary();
      String var4 = com.aspose.slides.internal.z0k.z1.l6(var1, "App.xaml");
      String var5 = "wpftemplates/BaseProject_App_xaml_Template.txt";
      String var6 = x4q.l6(var5);
      var6 = com.aspose.slides.ms.System.d1.n5(var6, "{Namespace}", var2);
      byte[] var7 = v7.n5(var6);
      var3.addItem(var4, var7);
      String var8 = com.aspose.slides.internal.z0k.z1.l6(var1, "App.xaml.cs");
      String var9 = "wpftemplates/BaseProject_App_xaml_cs_Template.txt";
      String var10 = x4q.l6(var9);
      var10 = com.aspose.slides.ms.System.d1.n5(var10, "{Namespace}", var2);
      byte[] var11 = v7.n5(var10);
      var3.addItem(var8, var11);
      return var3;
   }

   private KeyValuePair<String, byte[]> n5(String var1) {
      String var2 = com.aspose.slides.internal.z0k.z1.l6(var1, "App.config");
      String var3 = "wpftemplates/BaseProject_App_config_Template.txt";
      String var4 = x4q.l6(var3);
      byte[] var5 = v7.n5(var4);
      return new KeyValuePair<>(var2, var5);
   }

   private Dictionary<String, byte[]> n5(String var1, XamlOptions var2) {
      Dictionary var3 = new Dictionary();
      String var4 = com.aspose.slides.internal.z0k.z1.l6(var1, "Properties");
      String var5 = com.aspose.slides.internal.z0k.z1.l6(var4, "AssemblyInfo.cs");
      String var6 = "wpftemplates/BaseProject_AssemblyInfo_cs_Template.txt";
      String var7 = x4q.l6(var6);
      var7 = com.aspose.slides.ms.System.d1.n5(var7, "{ProjectName}", var2.u9());
      byte[] var8 = v7.n5(var7);
      var3.addItem(var5, var8);
      String var9 = com.aspose.slides.internal.z0k.z1.l6(var4, "Resources.Designer.cs");
      String var10 = "wpftemplates/BaseProject_Resources_Designer_cs_Template.txt";
      String var11 = x4q.l6(var10);
      var11 = com.aspose.slides.ms.System.d1.n5(var11, "{Namespace}", var2.k5());
      byte[] var12 = v7.n5(var11);
      var3.addItem(var9, var12);
      String var13 = com.aspose.slides.internal.z0k.z1.l6(var4, "Resources.resx");
      String var14 = "wpftemplates/BaseProject_Resources_resx_Template.txt";
      String var15 = x4q.l6(var14);
      byte[] var16 = v7.n5(var15);
      var3.addItem(var13, var16);
      String var17 = com.aspose.slides.internal.z0k.z1.l6(var4, "Settings.Designer.cs");
      String var18 = "wpftemplates/BaseProject_Settings_Designer_cs_Template.txt";
      String var19 = x4q.l6(var18);
      var19 = com.aspose.slides.ms.System.d1.n5(var19, "{Namespace}", var2.k5());
      byte[] var20 = v7.n5(var19);
      var3.addItem(var17, var20);
      String var21 = com.aspose.slides.internal.z0k.z1.l6(var4, "Settings.settings");
      String var22 = "wpftemplates/BaseProject_Settings_settings_Template.txt";
      String var23 = x4q.l6(var22);
      byte[] var24 = v7.n5(var23);
      var3.addItem(var21, var24);
      return var3;
   }

   private Dictionary<String, byte[]> l6(String var1) {
      Dictionary var2 = new Dictionary();
      String var3 = com.aspose.slides.internal.z0k.z1.l6(var1, "Icons");
      String var4 = com.aspose.slides.internal.z0k.z1.l6(var3, "ic_down.png");
      String var5 = "xamarinforms/drawable_xxxhdpi/ic_down.png";
      byte[] var6 = x4q.n5(var5);
      var2.addItem(var4, var6);
      String var7 = com.aspose.slides.internal.z0k.z1.l6(var3, "ic_up.png");
      String var8 = "xamarinforms/drawable_xxxhdpi/ic_up.png";
      byte[] var9 = x4q.n5(var8);
      var2.addItem(var7, var9);
      return var2;
   }

   private KeyValuePair<String, byte[]> n5(String var1, com.aspose.slides.ms.System.o0 var2, com.aspose.slides.ms.System.o0 var3, String var4, XamlOptions var5) {
      String var6 = com.aspose.slides.internal.z0k.z1.l6(var1, com.aspose.slides.ms.System.d1.n5(new String[]{var5.a6(), ".sln"}));
      String var7 = "wpftemplates/Solution_Template.txt";
      String var8 = x4q.l6(var7);
      var8 = com.aspose.slides.ms.System.d1.n5(var8, "{ProjectName}", var5.u9());
      var8 = com.aspose.slides.ms.System.d1.n5(var8, "{ProjectGuid}", com.aspose.slides.ms.System.d1.n5(new String[]{"{", var3.toString(), "}"}));
      var8 = com.aspose.slides.ms.System.d1.n5(var8, "{SolutionGuid}", com.aspose.slides.ms.System.d1.n5(new String[]{"{", var2.toString(), "}"}));
      var8 = com.aspose.slides.ms.System.d1.n5(var8, "{ProjectTypeGuidString}", var4);
      byte[] var9 = v7.n5(var8);
      return new KeyValuePair<>(var6, var9);
   }
}
