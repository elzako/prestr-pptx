package com.aspose.slides.internal.k4y;

public class m9 extends b3 {
   private boolean n5;
   private g7 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "visible",
      "artisticBlur",
      "artisticCement",
      "artisticChalkSketch",
      "artisticCrisscrossEtching",
      "artisticCutout",
      "artisticFilmGrain",
      "artisticGlass",
      "artisticGlowDiffused",
      "artisticGlowEdges",
      "artisticLightScreen",
      "artisticLineDrawing",
      "artisticMarker",
      "artisticMosiaicBubbles",
      "artisticPaintStrokes",
      "artisticPaintBrush",
      "artisticPastelsSmooth",
      "artisticPencilGrayscale",
      "artisticPencilSketch",
      "artisticPhotocopy",
      "artisticPlasticWrap",
      "artisticTexturizer",
      "artisticWatercolorSponge",
      "backgroundRemoval",
      "brightnessContrast",
      "colorTemperature",
      "saturation",
      "sharpenSoften"
   );

   public m9(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      m9$1 var2 = new m9$1(this);
      n5(var1, var2);
      n5(var1, new m9$2(this, var1));
   }

   public m9() {
      this.k5();
   }

   private void k5() {
      this.n5 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("visible", this.n5 ? "1" : "0");
      }

      if (this.l6 != null) {
         switch (k5.n5(this.l6.n5())) {
            case 1:
               ((q7)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 2:
               ((q8)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 3:
               ((w0)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 4:
               ((q9)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 5:
               ((x6)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 6:
               ((r2)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 7:
               ((l7)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 8:
               ((q5)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 9:
               ((e4)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 10:
               ((g6)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 11:
               ((o9)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 12:
               ((a9)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 13:
               ((u0)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 14:
               ((q4)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 15:
               ((d8)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 16:
               ((f7)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 17:
               ((k9)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 18:
               ((s5)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 19:
               ((l2)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 20:
               ((j7)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 21:
               ((v2)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 22:
               ((e7)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 23:
               ((b7)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 24:
               ((r3)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 25:
               ((p1)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 26:
               ((k0)this.l6.k5()).n5("a14", var2, this.l6.n5());
               break;
            case 27:
               ((d4)this.l6.k5()).n5("a14", var2, this.l6.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static boolean n5(m9 var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(m9 var0, g7 var1) {
      return var0.l6 = var1;
   }
}
