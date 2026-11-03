package com.aspose.slides.internal.r1x;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.ms.System.d1;

public abstract class f0 extends m3 implements com.aspose.slides.internal.b8u.q0, com.aspose.slides.internal.b8u.t4 {
   private y2 y4;
   private com.aspose.slides.internal.b8u.t2 e2;
   private com.aspose.slides.internal.b8u.u3 t9;
   private int z1;
   private boolean t4 = false;
   private boolean q0 = false;
   private boolean z3 = true;
   private x9 m1;

   protected f0() {
      this.k7();
   }

   public boolean m3() {
      return this.q0;
   }

   public boolean z8() {
      return this.z3;
   }

   public boolean j5() {
      return this.t4;
   }

   public com.aspose.slides.internal.t6q.s7 w1() {
      throw new NotImplementedException();
   }

   public void n5(com.aspose.slides.internal.t6q.s7 var1) {
      throw new NotImplementedException();
   }

   public final com.aspose.slides.internal.b8u.t2 r4() {
      return this.e2;
   }

   public final com.aspose.slides.internal.b8u.u3 c4() {
      return this.t9;
   }

   public final int y2() {
      return this.z1;
   }

   public v4 y1() {
      return v4.s7();
   }

   @Override
   public final boolean a0() {
      this.s7();
      return this.f2().n5();
   }

   public boolean d2() {
      return false;
   }

   public boolean d5() {
      return false;
   }

   public com.aspose.slides.internal.o9b.c8 s3() {
      return com.aspose.slides.internal.o9b.c8.u3;
   }

   protected final com.aspose.slides.internal.b8u.q0 p8() {
      return this.f2().l6();
   }

   protected final void n5(com.aspose.slides.internal.b8u.q0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.k5(var1);
   }

   public c4 f2() {
      if (this.y4.l6() == null) {
         this.k5(new f0$k5(this));
      }

      return this.y4.l6();
   }

   public final void n5(com.aspose.slides.internal.o9b.y2 var1, com.aspose.slides.internal.b8u.x8 var2) {
      f0$n5 var3 = new f0$n5(this, var2);
      o0.n5(var1.n3(), var3);
   }

   public final void n5(com.aspose.slides.internal.o9b.y2 var1, com.aspose.slides.internal.b8u.t9 var2, z6 var3) {
      f0$l6 var4 = new f0$l6(this, var2, var3);
      o0.n5(var1.n3(), var4);
   }

   public final int[] l6(com.aspose.slides.internal.o9b.y2 var1) {
      int var2 = com.aspose.slides.internal.o9b.c8.u3.h0();
      if (this.e2() != null) {
         var2 = this.e2().l6(0);
      }

      int[] var3;
      try {
         var3 = new int[(int)((long)var1.t2() * var1.l6())];
      } catch (OverflowException var5) {
         throw new OutOfMemoryException();
      }

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = var2;
      }

      return var3;
   }

   public final byte[] n5(com.aspose.slides.internal.o9b.y2 var1, z6 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("rawDataSettings");
      }

      int var3 = var1.u3();
      int var4 = var1.u9();
      long var5;
      if (var3 == 0 && var4 == this.z1()) {
         var5 = var2.k5();
      } else {
         int var7 = var2.n5().q0();
         int var8 = var7 * var3 / 8;
         int var9 = (var7 * var4 + 7) / 8;
         var5 = var9 - var8;
      }

      long var10 = var1.l6();
      long var12 = var5 * var10;

      try {
         return new byte[(int)var12];
      } catch (OverflowException var16) {
         throw new OutOfMemoryException();
      }
   }

   @Override
   public final void l6(com.aspose.slides.internal.o9b.y2 var1, com.aspose.slides.internal.b8u.x8 var2) {
      this.s7();
      com.aspose.slides.internal.b8u.x8 var3 = this.m3() ? new a5(var2) : var2;
      this.k5(var1.n3(), var3);
   }

   public final int[] k5(com.aspose.slides.internal.o9b.y2 var1) {
      this.s7();
      s0 var2 = new s0(var1.n3());
      com.aspose.slides.internal.b8u.x8 var3 = this.m3() ? new a5(var2) : var2;
      this.k5(var1.n3(), var3);
      return var2.n5();
   }

   public final long[] u3(com.aspose.slides.internal.o9b.y2 var1) {
      this.s7();
      v8 var2 = new v8(var1.n3());
      this.k5(var1.n3(), var2);
      return var2.l6();
   }

   public final com.aspose.slides.internal.o9b.c8[] a6(com.aspose.slides.internal.o9b.y2 var1) {
      return com.aspose.slides.internal.r1x.l6.n5(this.k5(var1.n3()));
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, z6 var2, com.aspose.slides.internal.b8u.t9 var3) {
      this.s7();
      if (var1.t2() > 0 && var1.l6() > 0) {
         this.f2().n5(var1.n3(), var2, var3);
      } else {
         throw new ArgumentException("The rectangle is empty or width and height is negative. Cannot proceed.");
      }
   }

   public final void n5(com.aspose.slides.internal.o9b.y2 var1, com.aspose.slides.internal.o9b.y2 var2, z6 var3, com.aspose.slides.internal.b8u.t9 var4) {
      this.s7();
      com.aspose.slides.internal.o9b.y2.n5(var1.n3(), var2.n3()).u3(var1);
      if (var1.t2() > 0 && var1.l6() > 0) {
         this.f2().n5(var1.n3(), var3, var4);
      } else {
         throw new ArgumentException("The rectangle has no common processing area. Cannot proceed.");
      }
   }

   @Override
   public final void l6(com.aspose.slides.internal.o9b.y2 var1, int[] var2) {
      this.k5(var1.n3(), var2);
   }

   public final void l6(com.aspose.slides.internal.b8u.q0 var1) {
      this.k5(var1);
   }

   @Override
   protected boolean n5(int var1) {
      return var1 == 3 ? true : super.n5(var1);
   }

   protected void i1() {
      if (this.j5()) {
         try {
            com.aspose.slides.internal.t6q.s7 var1 = this.w1();
            if (var1 == null) {
               com.aspose.slides.internal.t6q.a6 var2 = new com.aspose.slides.internal.t6q.a6(com.aspose.slides.ms.System.o0.l6().toString());
               com.aspose.slides.internal.t6q.n3 var3 = new com.aspose.slides.internal.t6q.n3(true);
               com.aspose.slides.internal.t6q.u9 var4 = new com.aspose.slides.internal.t6q.u9();
               var1 = new com.aspose.slides.internal.t6q.s7(var2, var3, var4);
            }

            com.aspose.slides.internal.i5k.l6 var8 = null;

            for (com.aspose.slides.internal.t6q.h0 var6 : var1.u3()) {
               var8 = com.aspose.slides.internal.v6g.k5.n5(var6, com.aspose.slides.internal.i5k.l6.class);
               if (var8 != null) {
                  break;
               }
            }

            if (var8 == null) {
               var8 = new com.aspose.slides.internal.i5k.l6();
               var1.n5(var8);
            }

            var8.n5(com.aspose.slides.ms.System.j5.t2().m3());
            this.n5(var1);
         } catch (RuntimeException var7) {
            com.aspose.slides.internal.f8y.n5.u3(d1.n5(new String[]{"Exception on RasterImage.UpdateMetadata: ", var7.toString()}));
         }
      }
   }

   protected abstract void n5(com.aspose.slides.internal.o9b.y2 var1, int[] var2);

   @Override
   protected void a6() {
      this.e5();
   }

   private void k7() {
      this.y4 = new y2(this);
      this.z3 = true;
      this.m1 = new f0$u3(null);
   }

   public void k5(com.aspose.slides.internal.b8u.q0 var1) {
      com.aspose.slides.internal.n6h.u3.n5(this.y4, var1);
   }

   private void e5() {
      if (this.y4.l6() != null) {
         this.b3();
      }

      super.a6();
   }

   private void b3() {
      com.aspose.slides.internal.n6h.u3.n5(this.y4, null);
   }

   private void k5(com.aspose.slides.internal.o9b.y2 var1, com.aspose.slides.internal.b8u.x8 var2) {
      this.s7();
      this.n5(var1.n3()).u3(var1);
      this.f2().n5(var1.n3(), var2);
   }

   private void k5(com.aspose.slides.internal.o9b.y2 var1, int[] var2) {
      synchronized (this.t2) {
         boolean var4 = this.n5(5);

         try {
            this.n5(var4);
            this.s7();
            this.k5(true);
            this.m1.n5(this, var1.n3(), var2);
         } finally {
            this.l6(var4);
         }
      }
   }
}
