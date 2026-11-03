package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.geom.Rectangle2D;

class b4i extends e8s {
   public final String n5;
   public final float l6;
   public final float k5;
   public final boolean u3;
   public final int a6;
   private boolean n3;
   private float y4 = 0.0F;
   private float e2 = 0.0F;
   private final List<l6l> t9 = new List<>();
   private boolean z1;
   w1g u9 = new w1g();

   b4i(MathematicalText var1, c0e var2, w1g var3, String var4) {
      super(var1, var2);
      IPortionFormat var5 = var1.getFormat();
      String var6 = com.aspose.slides.ms.System.d1.n5(var4) ? var1.getValue() : var4;
      if (!com.aspose.slides.ms.System.d1.n5(var6)) {
         var6 = m8y.n5(var6, MathematicalText.n5(var5));
         var6 = n5(var6);
      }

      this.n5 = var6;
      if (!com.aspose.slides.ms.System.n1.k5(var5.getEscapement()) && var5.getEscapement() != 0.0F) {
         this.e2 = -0.01F * var3.a6 * var5.getEscapement();
         var3.a6 *= 0.666F;
      }

      if (var3.u9 && !com.aspose.slides.ms.System.d1.n5(var6)) {
         if (!com.aspose.slides.ms.System.t9.a6(var6.charAt(0)) && !com.aspose.slides.ms.System.t9.u9(var6.charAt(0))) {
            var3.a6 *= 0.86F;
         } else if (var3.a6 / this.a6().n5 < 0.64) {
            var3.a6 = this.a6().n5 * 0.64F;
         }
      }

      if (this.l6().l6().l6()) {
         this.l6 = this.a6().n5;
         var3.y4 = 1.0F;
         var3.n3 = 1.0F;
         this.z1 = true;
      } else {
         this.l6 = var3.a6;
      }

      this.a6 = var3.x8;
      this.k5 = this.l6 / 96.0F;
      this.u3 = var3.h0;
      l6l.n5(this.n5, this.t9);
      if (this.t9.size() == 1 && "&".equals(this.t9.get_Item(0).n5)) {
         this.l6(true);
      }

      var3.n5(this.u9);
   }

   public final boolean n5() {
      return this.n3;
   }

   public final void l6(boolean var1) {
      this.n3 = var1;
   }

   public final MathematicalText l6() {
      return (MathematicalText)super.t2;
   }

   @Override
   protected y1m n5(d2k var1) {
      float var2 = p1e.n5(this.u3 ? this.l6 * 0.65F : this.l6);
      float var3 = this.l6 * 72.0F / 96.0F;
      b4i$l6 var4 = new b4i$l6();
      var4.n5 = new b4i$1(this, var3);
      var4.l6 = new b4i$2(this, var3);
      var4.k5 = var2;
      var4.u3 = this.k5;
      k2t var5 = this.n5(this.t9, var4.n5(), this.a6).n5();
      j0t var6 = var5.n5.l6();
      this.y4 = this.e2;
      float var7 = var5.l6;
      n3y var8 = new n3y();
      var8.n5 = var6.n5;
      var8.l6 = var6.l6;
      y1m var9 = new y1m();
      var9.l6 = var8;
      var9.n5 = var7;
      return var9;
   }

   @Override
   public void n5(v1l var1) {
      com.aspose.slides.internal.o9b.u3 var2 = this.k5();
      e3 var3 = var1.n5;
      if (!this.n5()) {
         List$Enumerator var4 = this.t9.iterator();

         try {
            while (var4.hasNext()) {
               l6l var5 = (l6l)var4.next();
               a0n var6 = var5.u3.n5();
               d2k var7 = var6.n5.u3();
               TextParam$FontArgs var8 = new TextParam$FontArgs();
               var8.Name = var6.l6.h0();
               var8.Height = var6.l6.c8() * 4.0F / 3.0F;
               TextParam var9 = new TextParam(this.a6().u9, 72.0F, var8.Clone());
               var9.n5(((com.aspose.slides.internal.o9b.i1)var2).h0().o8());
               com.aspose.slides.internal.o9b.y1 var10 = new com.aspose.slides.internal.o9b.y1(var7.n5, this.y4 + var7.l6 + var6.a6, 0.0F, 0.0F);
               if ("　".equals(var5.n5)) {
                  var3.n5(" ", var10.y4(), var9);
               } else {
                  var3.n5(var5.n5, var10.y4(), var9);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }
   }

   final com.aspose.slides.internal.o9b.u3 k5() {
      PortionFormat var1 = (PortionFormat)this.l6().getFormat();
      return this.a6().l6.invoke(var1);
   }

   private k2t n5(IGenericList<l6l> var1, b4i$l6 var2, int var3) {
      j0t var4 = new j0t();
      var4.n5 = 0.0F;
      var4.l6 = 0.0F;
      var4.k5 = -Float.MAX_VALUE;
      k2t var5 = new k2t();
      var5.l6 = 0.0F;
      var5.n5 = var4;
      if (var1.size() != 0 && !this.n5()) {
         com.aspose.slides.internal.o9b.l6 var6 = new com.aspose.slides.internal.o9b.l6(2, 2);

         try {
            com.aspose.slides.internal.o9b.z1 var7 = com.aspose.slides.internal.o9b.z1.n5(var6);

            try {
               if (var1.size() > 1) {
                  j0t[] var8 = (j0t[])com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(j0t.class), var1.size())
                  );
                  var5.l6 = 0.0F;

                  for (int var9 = 0; var9 < var1.size(); var9++) {
                     l6l var10 = (l6l)var1.get_Item(var9);
                     k2t var11 = this.n5(var7, var10, var2.n5()).n5();
                     var10.u3.n5.n5 = var5.l6;
                     var11.n5.l6(var8[var9]);
                     var5.l6 = var5.l6 + var11.l6;
                     var5.n5.n5(var11.n5.l6()).l6(var5.n5);
                     if (var9 == 0
                        && "−".equals(var10.n5)
                        && (this.c8 == null || com.aspose.slides.internal.v6g.k5.l6(this.c8, b4i.class) && "=".equals(((b4i)this.c8).n5))) {
                        var10.l6 = false;
                     }

                     if (var10.l6 && var3 != 2) {
                        if (var9 > 0) {
                           var10.u3.n5.n5 = var10.u3.n5.n5 + var2.k5;
                           var5.l6 = var5.l6 + var2.k5;
                        }

                        if (var9 + 1 < var1.size() && var10.l6 && (var9 != 0 || var3 != 0)) {
                           var5.l6 = var5.l6 + var2.k5;
                        }
                     }
                  }

                  for (int var21 = 0; var21 < var1.size(); var21++) {
                     l6l var23 = (l6l)var1.get_Item(var21);
                     var23.u3.n5.l6 = var23.u3.n5.l6 + (var5.n5.n5 - var8[var21].n5);
                  }
               } else if (var1.size() > 0) {
                  l6l var20 = (l6l)var1.get_Item(0);
                  k2t var22 = this.n5(var7, var20, var2.n5()).n5();
                  var22.n5(var5);
               }
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }

         return var5;
      } else {
         return var5;
      }
   }

   private k2t n5(com.aspose.slides.internal.o9b.z1 var1, l6l var2, b4i$l6 var3) {
      j0t var4 = new j0t();
      var4.n5 = 0.0F;
      var4.l6 = 0.0F;
      var4.k5 = -Float.MAX_VALUE;
      float var5 = this.l6 * 72.0F / 96.0F;
      float var6 = this.u9.y4;
      if (var2.k5 == 1) {
         String var7 = com.aspose.slides.ms.System.d1.l6(var2.n5);
         if (var7.length() > 0 && com.aspose.slides.ms.System.t9.u9(var7, 0)) {
            var6 = 1.0F;
         }
      }

      var5 *= var2.k5 == 1 ? var6 : this.u9.n3;
      com.aspose.slides.internal.o9b.n3 var8 = this.a6().n5(this.l6(), var2.k5, var5);
      com.aspose.slides.internal.g7.u0a var22 = this.a6().k5.invoke(var8.h0());
      if (var22 == null) {
         throw new ArgumentException("The required font \"Cambria Math\" was not found.");
      }

      float var9 = n5(var1, var2.n5, var8, var3.k5, var3.u3, this.z1);
      float var10 = (float)(var22.t2().u3() & 4294967295L) / (var8.t2() * 4.0F / 3.0F);
      float var11 = var8.l6().k5(var8.x8()) / var10;
      IGenericEnumerator var12 = new l4(var2.n5).iterator();

      try {
         while (var12.hasNext()) {
            d6b var13 = (d6b)var12.next();
            d6b var14 = var13.l6();
            com.aspose.slides.internal.g7.r9[] var15 = var22.k5(var14.toString());
            com.aspose.slides.internal.g7.k6 var16 = var22.n5(var15[0]);
            j0t var17 = new j0t();
            var17.n5 = (float)(var16.n3().u3() / var10);
            var17.l6 = -((float)(var16.n3().l6() / var10));
            var17.k5 = (float)(var16.n3().u3() / var10) - var11;
            var4.n5(var17.l6()).l6(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }

      var2.u3 = new a0n();
      var2.u3.l6 = var8;
      var2.u3.u3 = new d2k(var9, var4.n5());
      var2.u3.k5 = var4.n5;
      var2.u3.n5 = new d2k(0.0F, var4.k5);
      var2.u3.a6 = var11;
      k2t var23 = new k2t();
      var23.l6 = var9;
      var4.l6(var23.n5);
      return var23;
   }

   private static float n5(com.aspose.slides.internal.o9b.z1 var0, String var1, com.aspose.slides.internal.o9b.n3 var2, float var3, float var4, boolean var5) {
      com.aspose.slides.internal.o9b.e5 var6 = new com.aspose.slides.internal.o9b.e5(com.aspose.slides.internal.o9b.e5.t2());
      float var7;
      if (var5) {
         var6.k5(var6.k5() | 2048);
         var7 = var0.n5(var1, var2, new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F), var6).l6();
      } else {
         var7 = var0.n5(var1, var2, new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F), var6).l6();

         for (int var8 = 0; var8 < var1.length(); var8++) {
            if (Character.isSurrogate(var1.charAt(var8))) {
               Rectangle2D var9 = com.aspose.slides.internal.o9b.n3.n5(var2).getStringBounds(var1, var0.z8().getFontRenderContext());
               var7 = (float)var9.getWidth();
               break;
            }
         }

         for (int var10 = var1.length() - 1; var10 >= 0; var10--) {
            if (!com.aspose.slides.ms.System.t9.h0(var1, var10)) {
               if (var10 < var1.length() - 1 && var1.charAt(var10) == '.') {
                  var7 += -5.0F * var4;
               }
               break;
            }

            if (var7 <= 0.0F || var1.length() > 1 && var1.charAt(var10) != 160) {
               var7 += var3;
            }

            if ("　".equals(var1)) {
               var7 += 2.0F * var3;
            }
         }
      }

      return var7;
   }

   private static String n5(String var0) {
      com.aspose.slides.internal.l7h.a5 var1 = null;

      for (int var2 = 0; var2 < var0.length(); var2++) {
         if (n5(var0.charAt(var2))) {
            if (var1 == null) {
               var1 = new com.aspose.slides.internal.l7h.a5(var0.length());
               if (var2 > 0) {
                  var1.n5(var0, 0, var2);
               }
            }
         } else if (var1 != null) {
            var1.n5(var0.charAt(var2));
         }
      }

      return var1 == null ? var0 : var1.toString();
   }

   private static boolean n5(char var0) {
      return var0 >= 8289 && var0 <= 8292;
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(j0t.class, new b4i$3());
   }
}
