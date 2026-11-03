package com.aspose.slides.internal.k4y;

public class i0a extends b3 {
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private int t2;
   private String s7;
   private int x8;
   private y1g n3;
   public static final int n5 = h9z.n5("800x600");
   public static final int l6 = l5d.n5("whiteTextOnBlack");
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "showAnimation", "resizeGraphics", "allowPng", "relyOnVml", "organizeInFolders", "useLongFilenames", "imgSz", "encoding", "clr", "extLst"
   );

   public i0a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i0a$1 var2 = new i0a$1(this);
      n5(var1, var2);
      n5(var1, new i0a$2(this, var1));
   }

   public i0a() {
      this.l6();
   }

   private void l6() {
      this.k5 = false;
      this.u3 = true;
      this.a6 = false;
      this.u9 = false;
      this.h0 = true;
      this.c8 = true;
      this.t2 = n5;
      this.s7 = "";
      this.x8 = l6;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5) {
         var2.l6("showAnimation", this.k5 ? "1" : "0");
      }

      if (!this.u3) {
         var2.l6("resizeGraphics", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("allowPng", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("relyOnVml", this.u9 ? "1" : "0");
      }

      if (!this.h0) {
         var2.l6("organizeInFolders", this.h0 ? "1" : "0");
      }

      if (!this.c8) {
         var2.l6("useLongFilenames", this.c8 ? "1" : "0");
      }

      if (this.t2 != n5) {
         var2.l6("imgSz", h9z.n5(this.t2));
      }

      if (!"".equals(this.s7)) {
         var2.l6("encoding", this.s7);
      }

      if (this.x8 != l6) {
         var2.l6("clr", l5d.n5(this.x8));
      }

      if (this.n3 != null) {
         this.n3.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return y4;
   }

   // $VF: synthetic method
   static boolean n5(i0a var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(i0a var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean k5(i0a var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean u3(i0a var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean a6(i0a var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean u9(i0a var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int n5(i0a var0, int var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String n5(i0a var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int l6(i0a var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static y1g n5(i0a var0, y1g var1) {
      return var0.n3 = var1;
   }
}
