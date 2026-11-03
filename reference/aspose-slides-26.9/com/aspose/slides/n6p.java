package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class n6p implements f1z {
   private j5u n5;
   private final TextFrame l6;
   private final e7k k5;
   private e2n[] u3;
   private final Dictionary<IParagraph, Object> a6 = new Dictionary<>();

   public n6p(TextFrame var1) {
      if (var1 == null) {
         throw new ArgumentNullException("textFrame");
      }

      this.l6 = var1;
      this.k5 = new e7k((Presentation)var1.getSlide().getPresentation());
   }

   @Override
   public final TextFrame n5() {
      return this.l6;
   }

   @Override
   public final void n5(d2k var1, s5u var2) {
      int var3 = 0;
      if (var2 != null) {
         Slide var4 = com.aspose.slides.internal.v6g.k5.n5(var2.u3(), Slide.class);
         if (var4 != null) {
            var3 = var4.j5();
         } else {
            NotesSlide var5 = com.aspose.slides.internal.v6g.k5.n5(var2.u3(), NotesSlide.class);
            if (var5 != null) {
               var3 = var5.getParentSlide().getSlideNumber();
            } else if (var2.u3() != null) {
               var3 = -1;
            }
         }
      }

      this.u3 = e2n.n5(this.n5(), var3);
      this.n5 = new j5u(this.n5(), var1.u3(), this.n5().getSlide(), this.k5, this.u3);
      ITextFrameFormatEffectiveData var6 = this.n5().getTextFrameFormat().getEffective();
      r0g var7 = this.n5().getParent_Immediate();
      if (com.aspose.slides.internal.v6g.k5.l6(var7, Shape.class)) {
         Shape var8 = (Shape)var7;
         if (var6.getAutofitType() == 1 && (var8.t2() & 4294967295L) != (var8.x8 & 4294967295L)) {
            this.n5(this.n5, var1.l6, var8.getPlaceholder());
         }
      }

      this.k5.n5();
   }

   @Override
   public final d2k l6() {
      if (this.n5 == null) {
         return d2k.k5;
      }

      r4d[] var1 = this.n5.e2();
      float var2 = Float.MAX_VALUE;

      for (r4d var6 : var1) {
         var2 = com.aspose.slides.ms.System.q1.l6(var2, var6.x8());
      }

      return new d2k(var2, this.n5.n3().l6);
   }

   @Override
   public final d2k k5() {
      return this.n5 != null ? new d2k(this.n5.t2(), this.n5.u9()) : d2k.k5;
   }

   @Override
   public final boolean u3() {
      return this.n5.y4();
   }

   @Override
   public final n2g[] u9() {
      r4d[] var1 = this.n5.e2();
      if (var1 == null) {
         return (n2g[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(n2g.class), 0));
      }

      n2g[] var2 = (n2g[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(n2g.class), var1.length));

      for (int var3 = 0; var3 < var2.length; var3++) {
         r4d var4 = var1[var3];
         var2[var3] = new n2g();
         var4.t2().n5(var2[var3].n5);
         var4.a6.n5(var2[var3].l6);
         var2[var3].k5 = var4.n3();
         var2[var3].u3 = var4.y4();
         var2[var3].a6 = !var4.k5.n5(var4.u3);
      }

      return var2;
   }

   @Override
   public final e4h[] h0() {
      int[] var1 = this.n5.h0();
      e4h[] var2 = (e4h[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(e4h.class), var1.length));

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3].n5 = var1[var3];
      }

      return var2;
   }

   @Override
   public final String n5(float var1, float var2, boolean var3) {
      return this.n5.n5(var1, var2, var3);
   }

   @Override
   public final boolean n5(e3 var1, s5u var2) {
      if (this.n5 != null) {
         if (!s3z.n5(this.n5())) {
            return false;
         }

         if (this.s7()) {
            return true;
         }

         this.n5.n5(var1, var2, this);
         return true;
      } else {
         return false;
      }
   }

   final boolean s7() {
      if (com.aspose.slides.ms.System.d1.l6(this.n5().t2()).isEmpty() && !this.n5().n3()) {
         for (e2n var4 : this.u3) {
            if (var4.n5.getBullet().getType() > 0) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public final d2k t2() {
      if (this.n5 == null) {
         return d2k.k5;
      }

      d2k var1 = d2k.k5.u3();
      d2k var2 = this.k5().u3();
      float var3 = this.n5 != null && this.n5.s7() ? this.n5.x8() : var2.n5;
      byte var4 = this.n5().n5.y1();
      if (var4 != 1 && var4 != 2 && var4 != 4 && var4 != 5 && var4 != 3 && var4 != 6) {
         var1.n5 += var3;
         var1.l6 = var1.l6 + var2.l6;
      } else {
         var1.n5 = var1.n5 + var2.l6;
         var1.l6 += var3;
      }

      return var1;
   }

   @Override
   public final void a6() {
      this.n5 = null;
   }

   @Override
   public final void n5(int var1, int var2, boolean var3) {
      for (int var4 = var1; var4 <= var2; var4++) {
         IParagraph var5 = this.n5().getParagraphs().get_Item(var4);
         if (var3) {
            this.a6.set_Item(var5, null);
         } else {
            this.a6.removeItemByKey(var5);
         }
      }
   }

   @Override
   public final s4s n5(Portion var1, boolean var2) {
      return this.n5.n5(var1, var2);
   }

   @Override
   public final s4s n5(Paragraph var1) {
      return this.n5.l6(var1);
   }

   @Override
   public final int l6(Paragraph var1) {
      return this.n5.n5(var1);
   }

   public final void x8() {
      this.k5.n5();
   }

   private void n5(j5u var1, float var2, IPlaceholder var3) {
      TextFrameFormat var4 = this.n5().n5;
      h9z var5 = var4.d2();
      float var6 = var5.h0();
      float var7 = var5.c8();
      if (var6 < 1.0 || var7 > 0.0F) {
         float var8 = var1.c8();
         if (var6 < 1.0) {
            var6 += 0.025F;
         }

         var1.l6(var6, 0.0F);
         if (var1.c8() > var2 && var8 < var2) {
            var1.l6(var4.n3(), var4.y4());
            return;
         }

         var6 = 1.0F;
         var7 = 0.0F;
      }

      var4.n5((byte)1);
      if (var1.c8() > var2) {
         boolean var18 = false;
         if (var3 != null) {
            var18 = TextFrame.a6.l6(var3.getType()) == 1;
         }

         if (var18) {
            var6 = 0.9F;
            var1.l6(var6, var7);
         } else {
            float var9 = 0.25F;
            float var10 = 1.0F;
            float var11 = 1.05F;

            while (var10 - var9 > 0.02510000037252903) {
               var6 = (float)(var9 + com.aspose.slides.ms.System.q1.u3((var10 - var9) / 0.025F / 2.0F) * 0.025F);
               var1.l6(var6, 0.2F);
               if (var1.c8() > var2) {
                  var10 = var6;
               } else {
                  var9 = var6;
               }
            }

            var6 = var10;
            var1.l6(var6, 0.0F);

            while (var6 >= var9) {
               while (var7 <= 0.2F) {
                  var1.n5(var2, var7);
                  float var12 = var2 / var1.c8();
                  if (var12 > var11) {
                     float var13 = var6;
                     float var14 = var7;
                     if (var7 == 0.2F) {
                        var7 = 0.1F;

                        while (var6 >= var13 - 0.075F) {
                           var6 -= 0.025F;
                           var1.l6(var6, var7);
                           float var15 = var2 / var1.c8();
                           if (var15 < var12) {
                              if (var15 > var11) {
                                 var4.n5(var6);
                                 var4.l6(var7);
                                 return;
                              }
                              break;
                           }
                        }

                        var6 = var13;
                        var7 = var14;
                     }

                     var4.n5(var6);
                     var4.l6(var7);
                     r4d[] var19 = var1.e2();
                     if (var19 != null && var19.length == 1) {
                        var4.l6(0.2F);
                     }

                     return;
                  }

                  var7 += 0.1F;
               }

               var7 = 0.0F;
               var6 -= 0.025F;
               var1.l6(var6, var7);
            }

            var7 = 0.2F;
         }
      }

      var4.n5(var6);
      var4.l6(var7);
   }

   final boolean n5(IParagraph var1) {
      return !this.a6.containsKey(var1);
   }

   @Override
   public final String[] c8() {
      return this.n5.k5();
   }

   static boolean n5(TextFrame var0) {
      IGenericEnumerator var1 = var0.getParagraphs().iterator();

      try {
         while (var1.hasNext()) {
            IParagraph var2 = (IParagraph)var1.next();
            IGenericEnumerator var3 = var2.getPortions().iterator();

            try {
               while (var3.hasNext()) {
                  IPortion var4 = (IPortion)var3.next();
                  MathPortion var5 = com.aspose.slides.internal.v6g.k5.n5(var4, MathPortion.class);
                  if (var5 != null && !a1w.n5(var5.getMathParagraph())) {
                     return false;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return true;
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(n2g.class, new n6p$1());
      com.aspose.slides.internal.v6g.k5.n5(e4h.class, new n6p$2());
   }
}
