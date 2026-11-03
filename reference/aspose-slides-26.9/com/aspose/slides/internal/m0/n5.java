package com.aspose.slides.internal.m0;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.g1.k5;
import com.aspose.slides.internal.i3.i1;
import com.aspose.slides.internal.i3.v4;
import com.aspose.slides.internal.i3.w1;
import com.aspose.slides.internal.l5.u9;
import com.aspose.slides.internal.o1.a6;
import com.aspose.slides.internal.o1.u3;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.q6.x8;
import com.aspose.slides.internal.y6.l6;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;

public class n5 extends l6 {
   private w1 n5;
   private i1 l6;
   private k5 k5 = null;

   public final w1 x8() {
      return this.n5;
   }

   public final void n5(w1 var1) {
      this.n5 = var1;
   }

   public final i1 n3() {
      return this.l6;
   }

   public final void n5(i1 var1) {
      this.l6 = var1;
   }

   @Override
   public int l6() {
      return this.n3() != null && this.n3().l6().n5() != this.n3().l6().k5() && this.n3().l6().l6() != this.n3().l6().u3() ? 2 : 1;
   }

   @Override
   public y2 k5() {
      this.q0();
      return this.k5.u3();
   }

   @Override
   public int E_() {
      this.q0();
      return this.l6() == 2 ? this.k5.l6().u3() : this.k5.u3().u3();
   }

   private void q0() {
      if (this.k5 == null) {
         this.k5 = new com.aspose.slides.internal.g1.l6(this, u3.l6()).n5();
      }
   }

   @Override
   public int F_() {
      this.q0();
      return this.l6() == 2 ? this.k5.l6().c8() : this.k5.u3().c8();
   }

   public final float y4() {
      this.q0();
      return this.k5.u3().t2();
   }

   @Override
   public int u9() {
      this.q0();
      return this.l6() != 2 && this.l6() != 1 ? this.k5.u3().t2() : this.k5.l6().t2();
   }

   public final float e2() {
      this.q0();
      return this.k5.u3().l6();
   }

   @Override
   public int h0() {
      this.q0();
      return this.l6() != 2 && this.l6() != 1 ? this.k5.u3().l6() : this.k5.l6().l6();
   }

   @Override
   public float c8() {
      return this.l6() == 2 && (this.n3().k5() & 65535) > 0 ? this.n3().k5() & 65535 : 72.0F;
   }

   @Override
   public float t2() {
      return this.l6() == 2 && (this.n3().k5() & 65535) > 0 ? this.n3().k5() & 65535 : 72.0F;
   }

   @Override
   public u9 s7() {
      throw new NotSupportedException("Unable to create graphics from wmf metafile.");
   }

   @Override
   public void a_(t4 var1) {
      com.aspose.slides.internal.d7.k5 var2 = new com.aspose.slides.internal.d7.k5(var1);
      var2.l6(this);
   }

   @Override
   public com.aspose.slides.internal.o9b.l6 u3() {
      return new a6(this, u3.l6()).u3();
   }

   public final com.aspose.slides.internal.d9.n5[] t9() {
      byte[] var1 = null;
      byte[] var2 = null;
      int var3 = 0;
      int var4 = 0;
      List var5 = new List();
      IGenericEnumerator var6 = this.n5().iterator();

      try {
         while (var6.hasNext()) {
            v4 var7 = (v4)var6.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var7, x8.class)) {
               x8 var8 = com.aspose.slides.internal.v6g.k5.n5(var7, x8.class);
               if (!var8.z3()) {
                  if (var1 == null) {
                     var1 = new byte[(int)var8.n3()];
                  }

                  com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5((Object)(var8.y4())), 0, com.aspose.slides.ms.System.u3.n5((Object)(var1)), var3, var8.y4().length
                  );
                  var3 += var8.y4().length;
                  if (var3 == (var8.n3() & 4294967295L)) {
                     com.aspose.slides.internal.d9.n5 var9 = (com.aspose.slides.internal.d9.n5)com.aspose.slides.internal.y6.l6.n5(new e2(var1));
                     var5.addItem(var9);
                     var3 = 0;
                     var1 = null;
                  }
               } else {
                  if (var2 == null) {
                     var2 = new byte[var8.m1().length];
                  } else {
                     byte[] var16 = new byte[var2.length + var8.m1().length];
                     System.arraycopy(var2, 0, var16, 0, var2.length);
                     var2 = var16;
                  }

                  com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5((Object)(var8.m1())), 0, com.aspose.slides.ms.System.u3.n5((Object)(var2)), var4, var8.m1().length
                  );
                  var4 += var8.m1().length;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      if (var2 != null && var2.length > 0) {
         try {
            com.aspose.slides.internal.d9.n5 var15 = (com.aspose.slides.internal.d9.n5)com.aspose.slides.internal.y6.l6.n5(new e2(var2));
            var5.addItem(var15);
         } catch (RuntimeException var13) {
         }
      }

      return (com.aspose.slides.internal.d9.n5[])var5.toArray(new com.aspose.slides.internal.d9.n5[0]);
   }

   public final k5 z1() {
      this.q0();
      return this.k5;
   }

   public final void n5(k5 var1) {
      this.k5 = var1;
   }

   public final void t4() {
      long var1 = 0L;
      var1 += this.x8().l6() & 65535;

      for (int var3 = 0; var3 < this.n5().size(); var3++) {
         v4 var4 = (v4)this.n5().n5(var3);
         var4.k5(var1 * 2L & 4294967295L);
         var1 += var4.e2() & 4294967295L;
      }

      this.x8().n5(var1 & 4294967295L);
   }
}
