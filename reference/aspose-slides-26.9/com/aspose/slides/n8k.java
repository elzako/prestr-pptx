package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.k4y.g7$n5;
import com.aspose.slides.ms.System.IDisposable;

class n8k {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "alphaBiLevel",
      "alphaCeiling",
      "alphaFloor",
      "alphaInv",
      "alphaMod",
      "alphaModFix",
      "alphaRepl",
      "biLevel",
      "blur",
      "clrChange",
      "clrRepl",
      "duotone",
      "fillOverlay",
      "grayscl",
      "hsl",
      "lum",
      "tint"
   );

   public static void n5(IImageTransformOperationCollection var0, IGenericEnumerable<com.aspose.slides.internal.k4y.g7> var1, t5w var2) {
      if (var1 != null) {
         IGenericEnumerator var3 = var1.iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
               switch (n5.n5(var4.n5())) {
                  case 0:
                     com.aspose.slides.internal.k4y.p0 var5 = (com.aspose.slides.internal.k4y.p0)var4.l6();
                     var0.addAlphaBiLevelEffect(var5.n5());
                     break;
                  case 1:
                     var0.addAlphaCeilingEffect();
                     break;
                  case 2:
                     var0.addAlphaFloorEffect();
                     break;
                  case 3:
                     com.aspose.slides.internal.k4y.l9 var6 = (com.aspose.slides.internal.k4y.l9)var4.l6();
                     IAlphaInverse var7 = var0.addAlphaInverseEffect();
                     c4i.n5(((AlphaInverse)var7).l6(), var6.n5());
                     break;
                  case 4:
                     var0.addAlphaModulateEffect();
                     break;
                  case 5:
                     com.aspose.slides.internal.k4y.m5 var8 = (com.aspose.slides.internal.k4y.m5)var4.l6();
                     var0.addAlphaModulateFixedEffect(var8.n5());
                     break;
                  case 6:
                     com.aspose.slides.internal.k4y.p2 var9 = (com.aspose.slides.internal.k4y.p2)var4.l6();
                     var0.addAlphaReplaceEffect(var9.n5());
                     break;
                  case 7:
                     com.aspose.slides.internal.k4y.m7 var10 = (com.aspose.slides.internal.k4y.m7)var4.l6();
                     var0.addBiLevelEffect(var10.n5());
                     break;
                  case 8:
                     com.aspose.slides.internal.k4y.f9 var11 = (com.aspose.slides.internal.k4y.f9)var4.l6();
                     var0.addBlurEffect(var11.n5(), var11.l6());
                     break;
                  case 9:
                     com.aspose.slides.internal.k4y.x4 var12 = (com.aspose.slides.internal.k4y.x4)var4.l6();
                     IColorChange var13 = var0.addColorChangeEffect();
                     ((ColorChange)var13).n5(var12.n5());
                     c4i.n5(var13.getFromColor(), var12.l6().n5());
                     c4i.n5(var13.getToColor(), var12.k5().n5());
                     break;
                  case 10:
                     com.aspose.slides.internal.k4y.l3 var14 = (com.aspose.slides.internal.k4y.l3)var4.l6();
                     IColorReplace var15 = var0.addColorReplaceEffect();
                     c4i.n5(var15.getColor(), var14.n5());
                     break;
                  case 11:
                     com.aspose.slides.internal.k4y.d4n var16 = (com.aspose.slides.internal.k4y.d4n)var4.l6();
                     IDuotone var17 = var0.addDuotoneEffect();
                     c4i.n5(var17.getColor1(), var16.n5().get_Item(0));
                     c4i.n5(var17.getColor2(), var16.n5().get_Item(1));
                     break;
                  case 12:
                     com.aspose.slides.internal.k4y.k1d var18 = (com.aspose.slides.internal.k4y.k1d)var4.l6();
                     IFillOverlay var19 = var0.addFillOverlayEffect();
                     var19.setBlend(var18.n5());
                     x9f.n5(var19.getFillFormat(), var18.l6(), var2);
                     break;
                  case 13:
                     var0.addGrayScaleEffect();
                     break;
                  case 14:
                     com.aspose.slides.internal.k4y.t1z var20 = (com.aspose.slides.internal.k4y.t1z)var4.l6();
                     var0.addHSLEffect(var20.n5(), var20.l6(), var20.k5());
                     break;
                  case 15:
                     com.aspose.slides.internal.k4y.k3h var21 = (com.aspose.slides.internal.k4y.k3h)var4.l6();
                     var0.addLuminanceEffect(var21.n5(), var21.l6());
                     break;
                  case 16:
                     com.aspose.slides.internal.k4y.j8o var22 = (com.aspose.slides.internal.k4y.j8o)var4.l6();
                     var0.addTintEffect(var22.n5(), var22.l6());
                     break;
                  default:
                     throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var4.n5(), "\""}));
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   public static void n5(IImageTransformOperationCollection var0, g7$n5 var1, g6c var2) {
      IGenericEnumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            IImageTransformOperation var4 = (IImageTransformOperation)var3.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var4, IAlphaBiLevel.class)) {
               com.aspose.slides.internal.k4y.p0 var5 = (com.aspose.slides.internal.k4y.p0)var1.n5("alphaBiLevel").l6();
               IAlphaBiLevel var6 = (IAlphaBiLevel)var4;
               var5.n5(var6.getThreshold());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IAlphaCeiling.class)) {
               var1.n5("alphaCeiling");
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IAlphaFloor.class)) {
               var1.n5("alphaFloor");
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IAlphaInverse.class)) {
               com.aspose.slides.internal.k4y.l9 var10 = (com.aspose.slides.internal.k4y.l9)var1.n5("alphaInv").l6();
               IAlphaInverse var22 = (IAlphaInverse)var4;
               c4i.n5(((AlphaInverse)var22).l6(), new n8k$1(var10));
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IAlphaModulate.class)) {
               var1.n5("alphaMod");
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IAlphaModulateFixed.class)) {
               com.aspose.slides.internal.k4y.m5 var11 = (com.aspose.slides.internal.k4y.m5)var1.n5("alphaModFix").l6();
               IAlphaModulateFixed var23 = (IAlphaModulateFixed)var4;
               var11.n5(var23.getAmount());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IAlphaReplace.class)) {
               com.aspose.slides.internal.k4y.p2 var12 = (com.aspose.slides.internal.k4y.p2)var1.n5("alphaRepl").l6();
               IAlphaReplace var24 = (IAlphaReplace)var4;
               var12.n5(((AlphaReplace)var24).l6());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IBiLevel.class)) {
               com.aspose.slides.internal.k4y.m7 var13 = (com.aspose.slides.internal.k4y.m7)var1.n5("biLevel").l6();
               IBiLevel var25 = (IBiLevel)var4;
               var13.n5(((BiLevel)var25).u3());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IBlur.class)) {
               com.aspose.slides.internal.k4y.f9 var14 = (com.aspose.slides.internal.k4y.f9)var1.n5("blur").l6();
               IBlur var26 = (IBlur)var4;
               var14.n5(var26.getRadius());
               var14.n5(var26.getGrow());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IColorChange.class)) {
               com.aspose.slides.internal.k4y.x4 var15 = (com.aspose.slides.internal.k4y.x4)var1.n5("clrChange").l6();
               IColorChange var27 = (IColorChange)var4;
               var15.n5(((ColorChange)var27).u3());
               c4i.n5(var27.getFromColor(), new n8k$2(var15));
               c4i.n5(var27.getToColor(), new n8k$3(var15));
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IColorReplace.class)) {
               com.aspose.slides.internal.k4y.l3 var16 = (com.aspose.slides.internal.k4y.l3)var1.n5("clrRepl").l6();
               IColorReplace var28 = (IColorReplace)var4;
               c4i.n5(var28.getColor(), new n8k$4(var16));
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IDuotone.class)) {
               com.aspose.slides.internal.k4y.d4n var17 = (com.aspose.slides.internal.k4y.d4n)var1.n5("duotone").l6();
               IDuotone var29 = (IDuotone)var4;
               c4i.n5(var29.getColor1(), new n8k$5(var17));
               c4i.n5(var29.getColor2(), new n8k$6(var17));
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IFillOverlay.class)) {
               com.aspose.slides.internal.k4y.k1d var18 = (com.aspose.slides.internal.k4y.k1d)var1.n5("fillOverlay").l6();
               IFillOverlay var30 = (IFillOverlay)var4;
               var18.n5(var30.getBlend());
               x9f.n5(var30.getFillFormat(), new n8k$7(var18), var2);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IGrayScale.class)) {
               var1.n5("grayscl");
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IHSL.class)) {
               com.aspose.slides.internal.k4y.t1z var19 = (com.aspose.slides.internal.k4y.t1z)var1.n5("hsl").l6();
               IHSL var31 = (IHSL)var4;
               var19.n5(((HSL)var31).u3());
               var19.l6(((HSL)var31).a6());
               var19.k5(((HSL)var31).u9());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, ILuminance.class)) {
               com.aspose.slides.internal.k4y.k3h var20 = (com.aspose.slides.internal.k4y.k3h)var1.n5("lum").l6();
               ILuminance var32 = (ILuminance)var4;
               var20.n5(((Luminance)var32).u3());
               var20.l6(((Luminance)var32).a6());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, ITint.class)) {
               com.aspose.slides.internal.k4y.j8o var21 = (com.aspose.slides.internal.k4y.j8o)var1.n5("tint").l6();
               ITint var33 = (ITint)var4;
               var21.n5(((Tint)var33).u3());
               var21.l6(((Tint)var33).a6());
            } else if (!com.aspose.slides.internal.v6g.k5.l6(var4, IBrightnessContrast.class)) {
               throw new Exception();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }
}
