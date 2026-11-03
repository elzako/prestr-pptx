package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.IDisposable;

public abstract class u8 implements IDisposable {
   protected int k5;
   protected byte[] u3;
   protected int a6;
   protected byte[] u9;
   protected e5[] h0;
   protected e5[] c8;
   protected int t2;
   protected int s7 = 1;
   protected int x8 = 2;
   private boolean n5 = false;

   protected u8() {
   }

   @Override
   public void dispose() {
      this.n5(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   public void h0() {
      this.n5(true);
   }

   protected void n5(boolean var1) {
      if (!this.n5) {
         if (this.u9 != null) {
            com.aspose.slides.ms.System.u3.n5(this.u9, 0, this.u9.length);
            this.u9 = null;
         }

         if (var1) {
         }

         this.n5 = true;
      }
   }

   public int c8() {
      return this.k5;
   }

   public void l6(int var1) {
      if (!e5.n5(this.h0, var1)) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("block size not supported by algorithm"));
      }

      if (this.k5 != var1) {
         this.k5 = var1;
         this.u3 = null;
      }
   }

   public int t2() {
      return this.t2;
   }

   public byte[] s7() {
      if (this.u3 == null) {
         this.l6();
      }

      return (byte[])this.u3.clone();
   }

   public void u3(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var1.length << 3 != this.k5) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("IV length is different than block size"));
      }

      this.u3 = (byte[])var1.clone();
   }

   public byte[] u3() {
      if (this.u9 == null) {
         this.n5();
      }

      return (byte[])this.u9.clone();
   }

   public void k5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      int var2 = var1.length << 3;
      if (!e5.n5(this.c8, var2)) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Key size not supported by algorithm"));
      }

      this.a6 = var2;
      this.u9 = (byte[])var1.clone();
   }

   public int u9() {
      return this.a6;
   }

   public void n5(int var1) {
      if (!e5.n5(this.c8, var1)) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Key size not supported by algorithm"));
      }

      this.a6 = var1;
      this.u9 = null;
   }

   public e5[] x8() {
      return this.c8;
   }

   public int n3() {
      return this.s7;
   }

   public void k5(int var1) {
      if (!com.aspose.slides.ms.System.d5.isDefined(x8.class, var1)) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Cipher mode not available"));
      }

      this.s7 = var1;
   }

   public int y4() {
      return this.x8;
   }

   public void u3(int var1) {
      if (!com.aspose.slides.ms.System.d5.isDefined(h2.class, var1)) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Padding mode not available"));
      }

      this.x8 = var1;
   }

   public i1 e2() {
      return this.l6(this.u3(), this.s7());
   }

   public abstract i1 l6(byte[] var1, byte[] var2);

   public i1 t9() {
      return this.n5(this.u3(), this.s7());
   }

   public abstract i1 n5(byte[] var1, byte[] var2);

   public abstract void l6();

   public abstract void n5();

   public boolean a6(int var1) {
      return e5.n5(this.c8, var1);
   }

   public static u8 z1() {
      return l6(n1.class.getName());
   }

   public static u8 l6(String var0) {
      return (u8)y4.n5(var0);
   }

   @Override
   public String toString() {
      String var1 = com.aspose.slides.ms.System.j8.n5(this).s7().substring(com.aspose.slides.ms.System.j8.n5(this).s7().lastIndexOf(46) + 1);
      return "System.Security.Cryptography." + var1;
   }
}
