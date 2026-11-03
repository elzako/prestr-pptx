package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.OperationCanceledException;
import com.aspose.slides.ms.System.IDisposable;

class s5u {
   private com.aspose.slides.internal.o9b.y1 n5 = new com.aspose.slides.internal.o9b.y1();
   private final IWarningCallback l6;
   private final com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> k5;
   private int u3;
   private float a6;
   private final boolean u9;
   private final IBaseSlide h0;
   private final boolean c8;
   private final boolean t2;
   private final float s7;
   private final int x8;
   private final float n3;
   private final int y4;
   private final boolean e2;
   private final boolean t9;
   private IHyperlink z1;
   private InkOptions t4;
   private boolean q0;

   public final IBaseSlide u3() {
      return this.h0;
   }

   public final com.aspose.slides.internal.k9.h0 n5(com.aspose.slides.internal.o9b.t4 var1) {
      Dictionary$Enumerator var2 = this.k5.l6().iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (((com.aspose.slides.internal.k9.u9)var3.getValue()).l6()
               && com.aspose.slides.ms.System.j8.l6(var1, ((com.aspose.slides.internal.k9.u9)var3.getValue()).k5())) {
               return (com.aspose.slides.internal.k9.h0)var3.getKey();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   public final boolean a6() {
      return this.u9;
   }

   public final boolean u9() {
      return this.c8;
   }

   public final boolean h0() {
      return this.t2;
   }

   public final IInkOptions c8() {
      return this.t4;
   }

   public final boolean t2() {
      return this.t9;
   }

   public final boolean s7() {
      return this.q0;
   }

   public s5u(IBaseSlide var1, com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> var2, y4x var3) {
      this.h0 = var1;
      this.k5 = var2;
      this.u9 = var3.n5;
      this.l6 = var3.u3;
      this.s7 = var3.k5;
      this.c8 = var3.l6;
      this.t2 = var3.h0;
      this.x8 = var3.a6 & 255;
      this.n3 = var3.u9;
      this.y4 = var3.t2;
      this.e2 = var3.s7;
      this.t9 = var3.n3;
      this.t4 = new InkOptions();
      this.t4.setHideInk(var3.e2.getHideInk());
      this.t4.setInterpretMaskOpAsOpacity(var3.e2.getInterpretMaskOpAsOpacity());
      this.a6 = var3.t9;
      this.u3 = var3.z1;
      this.q0 = var3.t4;
   }

   public final float x8() {
      return this.s7;
   }

   public final int n3() {
      return this.x8;
   }

   public final float y4() {
      return this.n3;
   }

   public final IHyperlink e2() {
      return this.z1;
   }

   public final void n5(IHyperlink var1) {
      this.z1 = var1;
   }

   public final int t9() {
      return this.y4;
   }

   public final boolean z1() {
      return this.e2;
   }

   public final com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> t4() {
      return this.k5;
   }

   public final com.aspose.slides.internal.o9b.y1 q0() {
      return this.n5.y4();
   }

   public final void n5(com.aspose.slides.internal.o9b.y1 var1) {
      this.n5 = var1.y4();
   }

   public final float z3() {
      return this.a6;
   }

   public final int m1() {
      return this.u3;
   }

   public void n5(e3 var1, Shape var2, InterruptionToken var3) {
      try {
         if (!var1.k7()) {
            var1.n5(var2);
         }

         var2.e5().n5(var1, this, var3);
      } catch (com.aspose.slides.internal.n8e.n5 var13) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, r1c.class)) {
            throw new PptxException("Thumbnail drawing aborted.", var13);
         }

         throw var13;
      } catch (OperationCanceledException var14) {
         throw var14;
      } catch (RuntimeException var15) {
         Slide var5 = com.aspose.slides.internal.v6g.k5.n5(var2.getSlide(), Slide.class);
         String var6 = var5 != null
            ? com.aspose.slides.ms.System.d1.n5(new String[]{"Slide #", com.aspose.slides.ms.System.a3.l6(var5.z8() + 1)})
            : com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.j8.n5(var2.getSlide()).s7(), " \"", var2.getSlide().getName(), "\""});
         String var7 = com.aspose.slides.ms.System.d1.n5("Shape #{0} at {1} at position {2}x{3} cannot be drawn",new Object[]{ var2.v4(), var6, var2.getX(), var2.getY()});
         this.n5(var7, 1);
         com.aspose.slides.internal.n8e.v4.n5(var15);
      } finally {
         var1.n5((Shape)null);
      }
   }

   final void n5(String var1, int var2) {
      com.aspose.slides.internal.n8e.u6 var3 = new com.aspose.slides.internal.n8e.u6(var1, var2);
      var3.sendWarning(this.l6);
   }

   public boolean n5(e3 var1, TextFrame var2, com.aspose.slides.internal.w0.c8 var3) {
      var1.k5(var3);

      try {
         return var2.u3.n5(var1, this);
      } finally {
         var1.w1();
         var1.z3();
      }
   }

   public void n5(q4b var1, Portion var2, TextFrame var3) {
   }

   static com.aspose.slides.internal.k9.u9 n5(s5u var0, com.aspose.slides.internal.k9.h0 var1, PPImage var2) {
      com.aspose.slides.internal.k9.u9 var3 = null;
      if (var0 != null) {
         com.aspose.slides.internal.k9.u9[] var4 = new com.aspose.slides.internal.k9.u9[]{var3};
         var0.t4().n5(var1, var4);
         var3 = var4[0];
      }

      return var3 == null || !var3.u3() && !var3.l6() ? new com.aspose.slides.internal.k9.u9(var2.c8(), var2.getBinaryData()) : var3;
   }

   static com.aspose.slides.internal.k9.u9 l6(s5u var0, com.aspose.slides.internal.k9.h0 var1, PPImage var2) {
      com.aspose.slides.internal.k9.u9 var3 = null;
      if (var0 != null) {
         com.aspose.slides.internal.k9.u9[] var4 = new com.aspose.slides.internal.k9.u9[]{var3};
         var0.t4().n5(var1, var4);
         var3 = var4[0];
      }

      return var3 == null || !var3.u3() && !var3.l6() ? null : var3;
   }
}
