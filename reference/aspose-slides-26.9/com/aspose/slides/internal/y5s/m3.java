package com.aspose.slides.internal.y5s;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.ms.System.IDisposable;

public abstract class m3 extends n3 implements com.aspose.slides.internal.j3b.s7 {
   private com.aspose.slides.internal.j3b.s7 n5 = new m3$u3(this);
   private com.aspose.slides.internal.j3b.a6 l6;
   private com.aspose.slides.internal.j3b.k5 k5;
   private int u3;

   protected m3() {
   }

   protected m3(com.aspose.slides.internal.j3b.u3 var1) {
      super(var1);
   }

   @Override
   public z8 l6() {
      z8 var1 = this.n5.l6();
      var1.n5(this.l6);
      var1.l6(this.u3);
      var1.n5(this.k5);
      return var1;
   }

   @Override
   public boolean n5() {
      this.t2();
      return this.n5.n5();
   }

   public boolean z3() {
      return false;
   }

   public void n5(boolean var1) {
   }

   public com.aspose.slides.internal.j3b.s7 m1() {
      return this.n5;
   }

   public void n5(com.aspose.slides.internal.j3b.s7 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var1 != this.n5) {
         IDisposable var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5, IDisposable.class);
         if (var2 != null) {
            var2.dispose();
         }

         this.n5 = var1;
      }
   }

   public void l6(j5 var1, com.aspose.slides.internal.j3b.u9 var2) {
      m3$n5 var3 = new m3$n5(this, var2);
      t4.n5(var1.n3(), var3);
   }

   public void n5(j5 var1, com.aspose.slides.internal.j3b.c8 var2, z8 var3) {
      m3$l6 var4 = new m3$l6(this, var2, var3);
      t4.n5(var1.n3(), var4);
   }

   public int[] l6(j5 var1) {
      int var2 = 0;
      if (this.y4() != null) {
         var2 = this.y4().l6(0);
      }

      int[] var3;
      try {
         var3 = new int[(int)((long)var1.a6() * var1.u9())];
      } catch (OverflowException var5) {
         throw new OutOfMemoryException();
      }

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = var2;
      }

      return var3;
   }

   public byte[] n5(j5 var1, z8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("rawDataSettings");
      }

      int var3 = var1.h0();
      int var4 = var1.t2();
      long var5;
      if (var3 == 0 && var4 == this.t9()) {
         var5 = var2.a6();
      } else {
         int var7 = var2.n5().h0();
         int var8 = var7 * var3 / 8;
         int var9 = (var7 * var4 + 7) / 8;
         var5 = var9 - var8;
      }

      long var10 = var1.u9();
      long var12 = var5 * var10;

      try {
         return new byte[(int)var12];
      } catch (OverflowException var16) {
         throw new OutOfMemoryException();
      }
   }

   @Override
   public void n5(j5 var1, com.aspose.slides.internal.j3b.u9 var2) {
      this.t2();
      this.n5(var1.n3(), true, var2);
   }

   public int[] k5(j5 var1) {
      this.t2();
      m3$a6 var2 = new m3$a6(var1.n3());
      this.n5(var1.n3(), true, var2);
      return var2.n5();
   }

   public int[] u3(j5 var1) {
      return this.k5(var1.n3());
   }

   @Override
   public void n5(j5 var1, z8 var2, com.aspose.slides.internal.j3b.c8 var3) {
      this.t2();
      this.n5(var1.n3(), true, var2, var3);
   }

   public void l6(j5 var1, int[] var2) {
      this.t2();
      this.n5(var1.n3(), var2, true);
   }

   public void k5(j5 var1, int[] var2) {
      this.l6(var1.n3(), var2);
   }

   protected void k5(j5 var1, com.aspose.slides.internal.j3b.u9 var2) {
      m3$k5 var3 = new m3$k5(this.n5, var2);
      t4.n5(var1.n3(), var3);
   }

   protected abstract void n5(j5 var1, int[] var2);

   @Override
   protected void u9() {
      IDisposable var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5, IDisposable.class);
      if (var1 != null) {
         var1.dispose();
      }

      this.n5 = null;
      super.u9();
   }

   private int[] n5(j5 var1, boolean var2, com.aspose.slides.internal.j3b.u9 var3) {
      this.t2();
      this.n5(var1.n3()).n5(var1);
      int[] var4 = new int[1];
      return this.n5(var1.n3(), var4, var2, var3);
   }

   private void n5(j5 var1, int[] var2, boolean var3) {
      this.t2();
      if (var3) {
         this.n5(var1.n3(), var2);
      }
   }

   private int[] n5(j5 var1, int[] var2, boolean var3, com.aspose.slides.internal.j3b.u9 var4) {
      Object var5 = null;
      this.k5(var1.n3(), var4);
      return (int[])var5;
   }

   private byte[] n5(j5 var1, boolean var2, z8 var3, com.aspose.slides.internal.j3b.c8 var4) {
      this.t2();
      this.n5(var1.n3()).n5(var1);
      byte[] var5 = new byte[4];
      byte[] var6 = new byte[8];
      this.n5(var1.n3(), var5, var2, var3, var4);
      return var5;
   }

   private byte[] n5(j5 var1, byte[] var2, boolean var3, z8 var4, com.aspose.slides.internal.j3b.c8 var5) {
      Object var6 = null;
      this.n5.n5(var1.n3(), var4, var5);
      return (byte[])var6;
   }
}
