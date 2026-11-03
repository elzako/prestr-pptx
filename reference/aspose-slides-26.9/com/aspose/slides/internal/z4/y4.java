package com.aspose.slides.internal.z4;

import com.aspose.slides.Collections.Generic.Dictionary;

public class y4 {
   private static final Dictionary<Integer, String> n5 = new Dictionary<>();
   private static final Dictionary<Integer, String> l6 = new Dictionary<>();
   private static final Dictionary<Integer, String> k5 = new Dictionary<>();
   private static final Dictionary<Integer, String> u3 = new Dictionary<>();

   public static String n5(int var0) {
      return com.aspose.slides.internal.b8.h0.n5(n5, var0);
   }

   public static String l6(int var0) {
      return com.aspose.slides.internal.b8.h0.n5(l6, var0);
   }

   public static String k5(int var0) {
      return com.aspose.slides.internal.b8.h0.n5(k5, var0);
   }

   public static String u3(int var0) {
      return com.aspose.slides.internal.b8.h0.n5(u3, var0);
   }

   private static void n5() {
      Dictionary var0 = new Dictionary();
      var0.addItem(0, "/MediaBox");
      var0.addItem(1, "/CropBox");
      var0.addItem(2, "/BleedBox");
      var0.addItem(4, "/ArtBox");
      var0.addItem(3, "/TrimBox");
      com.aspose.slides.internal.b8.h0.n5(var0, n5, null);
   }

   private static void l6() {
      Dictionary var0 = new Dictionary();
      var0.addItem(3, "/FullScreen");
      var0.addItem(0, "/UseNone");
      var0.addItem(4, "/UseOC");
      var0.addItem(1, "/UseOutlines");
      var0.addItem(2, "/UseThumbs");
      com.aspose.slides.internal.b8.h0.n5(var0, l6, null);
   }

   private static void k5() {
      Dictionary var0 = new Dictionary();
      var0.addItem(1, "/OneColumn");
      var0.addItem(0, "/SinglePage");
      var0.addItem(2, "/TwoColumnLeft");
      var0.addItem(3, "/TwoColumnRight");
      var0.addItem(4, "/TwoPageLeft");
      var0.addItem(5, "/TwoPageRight");
      com.aspose.slides.internal.b8.h0.n5(var0, k5, null);
   }

   private static void u3() {
      Dictionary var0 = new Dictionary();
      var0.addItem(0, "/Btn");
      var0.addItem(2, "/Ch");
      var0.addItem(3, "/Sig");
      var0.addItem(1, "/Tx");
      com.aspose.slides.internal.b8.h0.n5(var0, u3, null);
   }

   static {
      n5();
      l6();
      k5();
      u3();
   }
}
