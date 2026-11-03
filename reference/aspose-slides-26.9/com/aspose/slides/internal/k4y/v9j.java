package com.aspose.slides.internal.k4y;

public class v9j extends b3 {
   private long n5;
   private long l6;
   private long k5;
   private long u3;
   private byte a6;
   private long u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private byte s7;
   private boolean x8;
   private s2b n3;
   private j1f y4;
   private m8u e2;
   private q8g t9;
   private f9y z1;
   private g7 t4;
   private c4t q0;
   private k2p z3;
   private l7h m1;
   private static final com.aspose.slides.internal.v6g.u9 k7 = new com.aspose.slides.internal.v6g.u9(
      "distT",
      "distB",
      "distL",
      "distR",
      "simplePos",
      "relativeHeight",
      "behindDoc",
      "locked",
      "layoutInCell",
      "hidden",
      "allowOverlap",
      "positionH",
      "positionV",
      "extent",
      "effectExtent",
      "wrapNone",
      "wrapSquare",
      "wrapTight",
      "wrapThrough",
      "wrapTopAndBottom",
      "docPr",
      "cNvGraphicFramePr",
      "graphic"
   );

   public v9j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      v9j$1 var2 = new v9j$1(this);
      n5(var1, var2);
      n5(var1, new v9j$2(this, var1));
   }

   public v9j() {
      this.l6();
      this.n3 = new s2b();
      this.y4 = new j1f();
      this.e2 = new m8u();
      this.t9 = new q8g();
      this.q0 = new c4t();
      this.m1 = new l7h();
   }

   private void l6() {
      this.n5 = 4294967295L;
      this.l6 = 4294967295L;
      this.k5 = 4294967295L;
      this.u3 = 4294967295L;
      this.a6 = -1;
      this.s7 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("distT", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("distB", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if ((this.k5 & 4294967295L) != 4294967295L) {
         var2.l6("distL", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if ((this.u3 & 4294967295L) != 4294967295L) {
         var2.l6("distR", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      if (this.a6 != -1) {
         var2.l6("simplePos", this.a6 == 1 ? "1" : "0");
      }

      var2.l6("relativeHeight", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      var2.l6("behindDoc", this.h0 ? "1" : "0");
      var2.l6("locked", this.c8 ? "1" : "0");
      var2.l6("layoutInCell", this.t2 ? "1" : "0");
      if (this.s7 != -1) {
         var2.l6("hidden", this.s7 == 1 ? "1" : "0");
      }

      var2.l6("allowOverlap", this.x8 ? "1" : "0");
      this.n3.n5("wp", var2, "simplePos");
      this.y4.n5("wp", var2, "positionH");
      this.e2.n5("wp", var2, "positionV");
      this.t9.n5("wp", var2, "extent");
      if (this.z1 != null) {
         this.z1.n5("wp", var2, "effectExtent");
      }

      if (this.t4 != null) {
         switch (k7.n5(this.t4.n5())) {
            case 15:
               ((q7y)this.t4.k5()).n5("wp", var2, this.t4.n5());
               break;
            case 16:
               ((t2r)this.t4.k5()).n5("wp", var2, this.t4.n5());
               break;
            case 17:
               ((c4w)this.t4.k5()).n5("wp", var2, this.t4.n5());
               break;
            case 18:
               ((v1j)this.t4.k5()).n5("wp", var2, this.t4.n5());
               break;
            case 19:
               ((n6x)this.t4.k5()).n5("wp", var2, this.t4.n5());
         }
      }

      this.q0.n5("wp", var2, "docPr");
      if (this.z3 != null) {
         this.z3.n5("wp", var2, "cNvGraphicFramePr");
      }

      this.m1.n5("a", var2, "graphic");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k7;
   }

   // $VF: synthetic method
   static long n5(v9j var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long l6(v9j var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long k5(v9j var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long u3(v9j var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static byte n5(v9j var0, byte var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static long a6(v9j var0, long var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean n5(v9j var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean l6(v9j var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean k5(v9j var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static byte l6(v9j var0, byte var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean u3(v9j var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static s2b n5(v9j var0, s2b var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static j1f n5(v9j var0, j1f var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static m8u n5(v9j var0, m8u var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static q8g n5(v9j var0, q8g var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static f9y n5(v9j var0, f9y var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static g7 n5(v9j var0, g7 var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static c4t n5(v9j var0, c4t var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static k2p n5(v9j var0, k2p var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static l7h n5(v9j var0, l7h var1) {
      return var0.m1 = var1;
   }
}
