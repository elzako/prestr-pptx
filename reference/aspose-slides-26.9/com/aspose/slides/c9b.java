package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class c9b extends c4t {
   public c9b(z1n var1) {
      super(var1);
   }

   public final IFormat n5(r0g var1, int var2, int var3) {
      Format var4 = new Format(var1);
      ColorFormat var5 = this.c8().n5(var1, var2, var3);
      s8u var6 = (s8u)this.c8().u3().createThemeEffective();
      if (this.l6().getFill().getFillType() == -1) {
         f6a var7 = var6.n5(this.n5().l6(), this.n5().getFillStyleIndex(), (ColorFormat)this.n5().getFillColor());
         if (var7 != null) {
            ((FillFormat)var4.getFill()).n5(var7);
         }
      } else {
         ((FillFormat)var4.getFill()).n5(this.l6().getFill());
      }

      if (this.l6().getLine().isFormatNotDefined()) {
         if (this.u3().l6()) {
            var4.getLine().getFillFormat().setFillType((byte)0);
         } else {
            t8r var8 = var6.l6(this.n5().l6(), this.n5().getLineStyleIndex() & 65535, (ColorFormat)this.n5().getLineColor());
            if (var8 != null) {
               ((LineFormat)var4.getLine()).n5(var8);
            }
         }
      } else {
         ((LineFormat)var4.getLine()).n5(this.l6().getLine());
      }

      if (!this.a6().l6()) {
         n5(var4.getFill(), this.n5(this.a6(), var5, var1, var2, var3));
      }

      if (!this.u3().l6()) {
         n5(var4.getLine().getFillFormat(), this.n5(this.u3(), var5, var1, var2, var3));
      }

      ((EffectFormat)var4.getEffect()).n5(this.l6().getEffect());
      if (!this.u9().l6()) {
         n5(var4.getEffect(), this.n5(this.u9(), var5, var1, var2, var3));
      }

      ((ThreeDFormat)var4.getEffect3D()).n5(this.l6().getEffect3D());
      n5(var4.getEffect(), var5);
      this.n5(var4, var2);
      return var4;
   }

   private IColorFormat n5(n4a var1, IColorFormat var2, r0g var3, int var4, int var5) {
      return var1.n5() ? var2 : this.c8().n5(var3, var1.k5(), var5);
   }

   private static void n5(IFillFormat var0, IColorFormat var1) {
      switch (var0.getFillType()) {
         case 1:
            n5(var0.getSolidFillColor(), var1);
            break;
         case 2:
            IGenericEnumerator var2 = var0.getGradientFormat().getGradientStops().iterator();

            try {
               while (var2.hasNext()) {
                  IGradientStop var3 = (IGradientStop)var2.next();
                  n5(var3.getColor(), var1);
               }
               break;
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
         case 3:
            n5(var0.getPatternFormat().getForeColor(), var1);
            n5(var0.getPatternFormat().getBackColor(), var1);
      }
   }

   private static void n5(ILineFillFormat var0, IColorFormat var1) {
      if (var1 != null) {
         switch (var0.getFillType()) {
            case 1:
               n5(var0.getSolidFillColor(), var1);
               break;
            case 2:
               IGenericEnumerator var2 = var0.getGradientFormat().getGradientStops().iterator();

               try {
                  while (var2.hasNext()) {
                     IGradientStop var3 = (IGradientStop)var2.next();
                     n5(var3.getColor(), var1);
                  }
                  break;
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                     var2.dispose();
                  }
               }
            case 3:
               n5(var0.getPatternFormat().getForeColor(), var1);
               n5(var0.getPatternFormat().getBackColor(), var1);
         }
      }
   }

   private static void n5(IEffectFormat var0, IColorFormat var1) {
      if (var1 != null) {
         if (var0.getGlowEffect() != null) {
            n5(var0.getGlowEffect().getColor(), var1);
         }

         if (var0.getInnerShadowEffect() != null) {
            n5(var0.getInnerShadowEffect().getShadowColor(), var1);
         }

         if (var0.getOuterShadowEffect() != null) {
            n5(var0.getOuterShadowEffect().getShadowColor(), var1);
         }

         if (var0.getPresetShadowEffect() != null) {
            n5(var0.getPresetShadowEffect().getShadowColor(), var1);
         }
      }
   }

   private static void n5(IColorFormat var0, IColorFormat var1) {
      if (var0.getSchemeColor() == 12 || var0.getSchemeColor() == -1) {
         var0.setSchemeColor(var1.getSchemeColor());

         for (int var2 = var1.getColorTransform().size() - 1; var2 >= 0; var2--) {
            IColorOperation var3 = var1.getColorTransform().get_Item(var2);
            var0.getColorTransform().insert(0, var3.getOperationType(), var3.getParameter());
         }
      }
   }
}
