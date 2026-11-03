package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public class a5 {
   private static final Dictionary<String, List<Integer>> n5 = new Dictionary<>();
   private static int l6 = -1;

   public static void n5(int var0, int var1, int var2) {
      if (l6 == -1) {
         switch (var1 + var2) {
            case 11:
               l6 = l6(var0);
               break;
            case 12:
               l6 = var0;
               break;
            case 13:
               l6 = n5(var0);
         }
      }
   }

   public static void l6(int var0, int var1, int var2) {
      int var3 = -1;
      switch (var1 + var2) {
         case 11:
            var3 = l6(var0);
            break;
         case 12:
            var3 = var0;
            break;
         case 13:
            var3 = n5(var0);
      }

      if (l6 == var3) {
         l6 = -1;
      }
   }

   private static int n5(int var0) {
      switch (var0) {
         case 0:
         case 19:
         case 20:
            return 1;
         case 1:
            return 4;
         case 2:
         case 8:
         case 12:
         case 14:
         case 15:
         case 16:
         case 18:
         case 23:
         default:
            return -1;
         case 3:
         case 4:
         case 7:
         case 9:
         case 10:
         case 11:
            return 0;
         case 5:
            return 6;
         case 6:
         case 17:
         case 21:
            return 2;
         case 13:
            return 5;
         case 22:
            return 7;
         case 24:
            return 8;
         case 25:
            return 3;
      }
   }

   private static int l6(int var0) {
      switch (var0) {
         case 2:
            return 10;
         case 3:
         case 4:
         default:
            return -1;
         case 5:
            return 12;
         case 6:
            return 13;
         case 7:
            return 6;
      }
   }

   static {
      List var0 = new List();
      var0.addItem(0);
      var0.addItem(1);
      var0.addItem(2);
      var0.addItem(3);
      n5.addItem("Aspose.Slides Presentation Converter for Java", var0);
      List var1 = new List();
      var1.addItem(4);
      n5.addItem("Aspose.Slides Presentation to PDF Converter for Java", var1);
      List var2 = new List();
      var2.addItem(5);
      n5.addItem("Aspose.Slides Presentation to HTML Converter for Java", var2);
      List var3 = new List();
      var3.addItem(6);
      n5.addItem("Aspose.Slides Presentation to TIFF Converter for Java", var3);
      List var4 = new List();
      var4.addItem(9);
      n5.addItem("Aspose.Slides Presentation to SVG Converter for Java", var4);
      List var5 = new List();
      var5.addItem(13);
      n5.addItem("Aspose.Slides Presentation to PNG Converter for Java", var5);
      List var6 = new List();
      var6.addItem(12);
      n5.addItem("Aspose.Slides Presentation to JPEG Converter for Java", var6);
      List var7 = new List();
      var7.addItem(15);
      n5.addItem("Aspose.Slides Presentation Merger for Java", var7);
      List var8 = new List();
      var8.addItem(16);
      n5.addItem("Aspose.Slides Presentation Text Extractor for Java", var8);
   }
}
