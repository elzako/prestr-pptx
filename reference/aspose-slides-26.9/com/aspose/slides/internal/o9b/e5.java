package com.aspose.slides.internal.o9b;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.ms.System.IDisposable;

public final class e5 implements IDisposable, com.aspose.slides.ms.System.v4, Cloneable {
   private u9[] n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private float t2;
   private float[] s7;
   private boolean x8 = false;
   private boolean n3 = false;

   public e5() {
      this(0, 0);
   }

   public e5(int var1) {
      this(var1, 0);
   }

   public e5(int var1, int var2) {
      this.l6 = 0;
      this.h0 = 0;
      this.u9 = 0;
      this.a6 = var1;
      this.u3 = 0;
      this.k5 = 0;
      this.c8 = 1;
   }

   public e5(e5 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("format");
      }

      this.l6 = var1.n5();
      this.h0 = var1.u9();
      this.u9 = var1.h0();
      this.a6 = var1.k5();
      this.u3 = var1.u3();
      this.k5 = var1.l6();
      this.c8 = var1.a6();
      this.x8 = var1.q0();
   }

   private void m1() {
      if (this.n3) {
         throw new ArgumentException("Already disposed");
      }
   }

   @Override
   public void dispose() {
      this.n3 = true;
   }

   public int n5() {
      this.m1();
      return this.l6;
   }

   public void n5(int var1) {
      if (var1 >= 0 && var1 <= 2) {
         this.m1();
         this.l6 = var1;
      } else {
         throw new InvalidEnumArgumentException("value");
      }
   }

   public int l6() {
      this.m1();
      return this.k5;
   }

   public void l6(int var1) {
      if (var1 >= 0 && var1 <= 2) {
         this.m1();
         this.k5 = var1;
      } else {
         throw new InvalidEnumArgumentException("value");
      }
   }

   public int k5() {
      this.m1();
      return this.a6;
   }

   public void k5(int var1) {
      this.m1();
      this.a6 = var1;
   }

   public int u3() {
      this.m1();
      return this.u3;
   }

   public void u3(int var1) {
      if (var1 >= 0 && var1 <= 2) {
         this.m1();
         this.u3 = var1;
      } else {
         throw new InvalidEnumArgumentException("value");
      }
   }

   public int a6() {
      this.m1();
      return this.c8;
   }

   public void a6(int var1) {
      if (var1 >= 0 && var1 <= 5) {
         this.m1();
         this.c8 = var1;
      } else {
         throw new InvalidEnumArgumentException("value");
      }
   }

   public int u9() {
      this.m1();
      return this.h0;
   }

   public int h0() {
      this.m1();
      return this.u9;
   }

   public static e5 c8() {
      return new e5();
   }

   public static e5 t2() {
      e5 var0 = new e5(24580, 0);
      var0.a6(0);
      var0.x8 = true;
      return var0;
   }

   public boolean s7() {
      return (this.k5() & 4096) != 0;
   }

   public boolean x8() {
      return (this.k5() & 2) != 0;
   }

   public boolean n3() {
      return (this.k5() & 2048) != 0;
   }

   public boolean y4() {
      return (this.k5() & 8192) != 0;
   }

   public boolean e2() {
      return (this.k5() & 16384) != 0;
   }

   public boolean t9() {
      return (this.k5() & 1) != 0;
   }

   public boolean z1() {
      return (this.k5() & 4) != 0;
   }

   public u9[] t4() {
      return this.n5;
   }

   public boolean q0() {
      return this.x8;
   }

   public void n5(u9[] var1) {
      if (var1 == null) {
         throw new NullReferenceException("Value of 'range' cannot be null");
      }

      if (var1.length > 32) {
         throw new OverflowException("Value of 'range.length' should be less than 32");
      }

      if (var1.length != 0) {
         this.n5 = (u9[])var1.clone();
      }
   }

   @Override
   public Object deepClone() {
      e5 var1 = (e5)this.z3();
      if (this.n5 != null) {
         var1.n5 = (u9[])this.n5.clone();
      }

      if (this.s7 != null) {
         var1.s7 = (float[])this.s7.clone();
      }

      return var1;
   }

   @Override
   public String toString() {
      return "[StringFormat, FormatFlags=" + com.aspose.slides.ms.System.s3.n5(b3.class, this.k5()) + "]";
   }

   private void l6(float var1, float[] var2) {
      this.s7 = null;
      this.t2 = var2.length >= 0 ? var1 : 0.0F;
      if (var2.length <= 0) {
         this.s7 = null;
      } else {
         this.s7 = new float[var2.length];
         if (this.s7 == null) {
            throw new OutOfMemoryException();
         }

         System.arraycopy(var2, 0, this.s7, 0, var2.length);
      }
   }

   public void n5(float var1, float[] var2) {
      if (var2 == null) {
         throw new NullReferenceException("Value of 'tabStops' cannot be null");
      }

      if (var1 < 0.0F) {
         throw new ArgumentException("Value of 'firstTabOffset' is invalid");
      }

      this.l6(var1, var2);
   }

   public void n5(int var1, int var2) {
      this.u9 = var2;
      this.h0 = var1;
   }

   public float[] n5(float[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'firstTabOffset' cannot be null");
      } else if (this.s7 == null) {
         var1[0] = 0.0F;
         return new float[0];
      } else {
         var1[0] = this.t2;
         float[] var2 = new float[this.s7.length];
         System.arraycopy(this.s7, 0, var2, 0, this.s7.length);
         return var2;
      }
   }

   protected Object z3() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
