package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class v0l extends b3 {
   private int l6;
   private boolean k5;
   private long u3;
   private String a6;
   private g7 u9;
   private d5i h0;
   private j9y c8;
   public static final int n5 = x0g.n5("fast");
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "spd",
      "advClick",
      "advTm",
      "p14:dur",
      "blinds",
      "checker",
      "circle",
      "dissolve",
      "comb",
      "cover",
      "cut",
      "diamond",
      "fade",
      "newsflash",
      "plus",
      "pull",
      "push",
      "random",
      "randomBar",
      "split",
      "strips",
      "wedge",
      "wheel",
      "wipe",
      "zoom",
      "vortex",
      "switch",
      "flip",
      "ripple",
      "honeycomb",
      "prism",
      "doors",
      "window",
      "ferris",
      "gallery",
      "conveyor",
      "pan",
      "glitter",
      "warp",
      "flythrough",
      "flash",
      "shred",
      "reveal",
      "wheelReverse",
      "prstTrans",
      "morph",
      "sndAc",
      "extLst"
   );

   public v0l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.s7();
      v0l$1 var2 = new v0l$1(this);
      n5(var1, var2);
      n5(var1, new v0l$2(this, var1));
   }

   public v0l() {
      this.s7();
   }

   private void s7() {
      this.l6 = n5;
      this.k5 = true;
      this.u3 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("spd", x0g.n5(this.l6));
      }

      if (!this.k5) {
         var2.l6("advClick", this.k5 ? "1" : "0");
      }

      if ((this.u3 & 4294967295L) != 4294967295L) {
         var2.l6("advTm", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      if (this.a6 != null) {
         var2.l6("p14:dur", this.a6);
      }

      if (this.u9 != null) {
         switch (t2.n5(this.u9.n5())) {
            case 4:
               ((f2b)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 5:
               ((f2b)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 6:
               ((e0j)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 7:
               ((e0j)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 8:
               ((f2b)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 9:
               ((q1m)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 10:
               ((x1c)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 11:
               ((e0j)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 12:
               ((x1c)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 13:
               ((e0j)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 14:
               ((e0j)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 15:
               ((q1m)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 16:
               ((p3h)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 17:
               ((e0j)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 18:
               ((f2b)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 19:
               ((w5g)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 20:
               ((f6b)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 21:
               ((e0j)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 22:
               ((o8h)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 23:
               ((p3h)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 24:
               ((p3u)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 25:
               ((p3h)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 26:
               ((s7n)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 27:
               ((s7n)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 28:
               ((q8s)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 29:
               ((e0j)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 30:
               ((j1p)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 31:
               ((f2b)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 32:
               ((f2b)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 33:
               ((s7n)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 34:
               ((s7n)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 35:
               ((s7n)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 36:
               ((p3h)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 37:
               ((g4m)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 38:
               ((p3u)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 39:
               ((n1e)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 40:
               ((e0j)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 41:
               ((c6d)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 42:
               ((u8h)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 43:
               ((o8h)this.u9.k5()).n5("p14", var2, this.u9.n5());
               break;
            case 44:
               ((n4i)this.u9.k5()).n5("p15", var2, this.u9.n5());
               break;
            case 45:
               ((o5y)this.u9.k5()).n5("p159", var2, this.u9.n5());
         }
      }

      if (this.h0 != null) {
         this.h0.n5("p", var2, "sndAc");
      }

      if (this.c8 != null) {
         this.c8.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final d5i n5() {
      if (this.h0 != null) {
         throw new Exception("Only one <sndAc> element can be added.");
      }

      this.h0 = new d5i();
      return this.h0;
   }

   public final void n5(x8 var1) {
      this.c8 = (j9y)var1;
   }

   public final g7 n5(String var1) {
      if (this.u9 != null) {
         throw new Exception("Transition already is initialized.");
      }

      switch (t2.n5(var1)) {
         case 4:
            this.u9 = new g7("blinds", new f2b());
            break;
         case 5:
            this.u9 = new g7("checker", new f2b());
            break;
         case 6:
            this.u9 = new g7("circle", new e0j());
            break;
         case 7:
            this.u9 = new g7("dissolve", new e0j());
            break;
         case 8:
            this.u9 = new g7("comb", new f2b());
            break;
         case 9:
            this.u9 = new g7("cover", new q1m());
            break;
         case 10:
            this.u9 = new g7("cut", new x1c());
            break;
         case 11:
            this.u9 = new g7("diamond", new e0j());
            break;
         case 12:
            this.u9 = new g7("fade", new x1c());
            break;
         case 13:
            this.u9 = new g7("newsflash", new e0j());
            break;
         case 14:
            this.u9 = new g7("plus", new e0j());
            break;
         case 15:
            this.u9 = new g7("pull", new q1m());
            break;
         case 16:
            this.u9 = new g7("push", new p3h());
            break;
         case 17:
            this.u9 = new g7("random", new e0j());
            break;
         case 18:
            this.u9 = new g7("randomBar", new f2b());
            break;
         case 19:
            this.u9 = new g7("split", new w5g());
            break;
         case 20:
            this.u9 = new g7("strips", new f6b());
            break;
         case 21:
            this.u9 = new g7("wedge", new e0j());
            break;
         case 22:
            this.u9 = new g7("wheel", new o8h());
            break;
         case 23:
            this.u9 = new g7("wipe", new p3h());
            break;
         case 24:
            this.u9 = new g7("zoom", new p3u());
            break;
         case 25:
            this.u9 = new g7("vortex", new p3h());
            break;
         case 26:
            this.u9 = new g7("switch", new s7n());
            break;
         case 27:
            this.u9 = new g7("flip", new s7n());
            break;
         case 28:
            this.u9 = new g7("ripple", new q8s());
            break;
         case 29:
            this.u9 = new g7("honeycomb", new e0j());
            break;
         case 30:
            this.u9 = new g7("prism", new j1p());
            break;
         case 31:
            this.u9 = new g7("doors", new f2b());
            break;
         case 32:
            this.u9 = new g7("window", new f2b());
            break;
         case 33:
            this.u9 = new g7("ferris", new s7n());
            break;
         case 34:
            this.u9 = new g7("gallery", new s7n());
            break;
         case 35:
            this.u9 = new g7("conveyor", new s7n());
            break;
         case 36:
            this.u9 = new g7("pan", new p3h());
            break;
         case 37:
            this.u9 = new g7("glitter", new g4m());
            break;
         case 38:
            this.u9 = new g7("warp", new p3u());
            break;
         case 39:
            this.u9 = new g7("flythrough", new n1e());
            break;
         case 40:
            this.u9 = new g7("flash", new e0j());
            break;
         case 41:
            this.u9 = new g7("shred", new c6d());
            break;
         case 42:
            this.u9 = new g7("reveal", new u8h());
            break;
         case 43:
            this.u9 = new g7("wheelReverse", new o8h());
            break;
         case 44:
            this.u9 = new g7("prstTrans", new n4i());
            break;
         case 45:
            this.u9 = new g7("morph", new o5y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.u9;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final boolean k5() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final long u3() {
      return this.u3;
   }

   public final void n5(long var1) {
      this.u3 = var1;
   }

   public final String a6() {
      return this.a6;
   }

   public final void l6(String var1) {
      this.a6 = var1;
   }

   public final g7 u9() {
      return this.u9;
   }

   public final d5i h0() {
      return this.h0;
   }

   public final x8 c8() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t2() {
      return t2;
   }

   // $VF: synthetic method
   static int n5(v0l var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(v0l var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long n5(v0l var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(v0l var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static g7 n5(v0l var0, g7 var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static d5i n5(v0l var0, d5i var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static j9y n5(v0l var0, j9y var1) {
      return var0.c8 = var1;
   }
}
