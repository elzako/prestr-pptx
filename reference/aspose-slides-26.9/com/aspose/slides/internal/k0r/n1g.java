package com.aspose.slides.internal.k0r;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import java.util.Arrays;

public class n1g implements IGenericCloneable<n1g>, Cloneable {
   private long n5 = 0L;
   private short l6 = 0;
   private short k5 = 0;
   private k3h u3 = null;
   private short[] a6 = new short[5];
   private short[] u9 = new short[5];

   public final void n5(int var1, e6a var2) {
      if (var1 >= 0 && var1 <= 4) {
         this.n5(var1, var2.n5().k5());
         this.l6(var1, var2.l6().k5());
      } else {
         throw new IndexOutOfRangeException(com.aspose.slides.ms.System.d1.n5("LevelIndex of textRuler level is out-of-range!!! [{0}]", new Object[]{var1}));
      }
   }

   public final e6a n5(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         e6a var2 = new e6a();
         var2.n5(this.u3(var1).k5());
         var2.l6(this.a6(var1).k5());
         return var2;
      } else {
         throw new IndexOutOfRangeException(com.aspose.slides.ms.System.d1.n5("LevelIndex of textRuler level is out-of-range!!! [{0}]", new Object[]{var1}));
      }
   }

   public final com.aspose.slides.ms.System.o5<Short> n5() {
      return this.u9(1) ? new com.aspose.slides.ms.System.o5<>(this.k5) : new com.aspose.slides.ms.System.o5<>();
   }

   public final void n5(com.aspose.slides.ms.System.o5<Short> var1) {
      if (var1.l6()) {
         this.k5 = (Short)var1.n5();
      }

      this.n5(1, var1.l6());
   }

   public final k3h l6() {
      return this.u9(4) ? this.u3 : null;
   }

   public final void n5(k3h var1) {
      this.u3 = var1;
      this.n5(4, var1 != null);
   }

   public final com.aspose.slides.ms.System.o5<Short> k5() {
      return this.u3(0);
   }

   public final com.aspose.slides.ms.System.o5<Short> u3() {
      return this.a6(0);
   }

   public final com.aspose.slides.ms.System.o5<Short> a6() {
      return this.u3(1);
   }

   public final com.aspose.slides.ms.System.o5<Short> u9() {
      return this.a6(1);
   }

   public final com.aspose.slides.ms.System.o5<Short> h0() {
      return this.u3(2);
   }

   public final com.aspose.slides.ms.System.o5<Short> c8() {
      return this.a6(2);
   }

   public final com.aspose.slides.ms.System.o5<Short> t2() {
      return this.u3(3);
   }

   public final com.aspose.slides.ms.System.o5<Short> s7() {
      return this.a6(3);
   }

   public final com.aspose.slides.ms.System.o5<Short> x8() {
      return this.u3(4);
   }

   public final com.aspose.slides.ms.System.o5<Short> n3() {
      return this.a6(4);
   }

   final void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      if (this.u9(2)) {
         this.l6 = var1.k7();
      }

      if (this.u9(1)) {
         this.k5 = var1.k7();
      }

      if (this.u9(4)) {
         this.u3 = new k3h(var1);
      }

      if (this.u9(8)) {
         this.a6[0] = var1.k7();
      }

      if (this.u9(256)) {
         this.u9[0] = var1.k7();
      }

      if (this.u9(16)) {
         this.a6[1] = var1.k7();
      }

      if (this.u9(512)) {
         this.u9[1] = var1.k7();
      }

      if (this.u9(32)) {
         this.a6[2] = var1.k7();
      }

      if (this.u9(1024)) {
         this.u9[2] = var1.k7();
      }

      if (this.u9(64)) {
         this.a6[3] = var1.k7();
      }

      if (this.u9(2048)) {
         this.u9[3] = var1.k7();
      }

      if (this.u9(128)) {
         this.a6[4] = var1.k7();
      }

      if (this.u9(4096)) {
         this.u9[4] = var1.k7();
      }
   }

   final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5);
      if (this.u9(2)) {
         var1.n5(this.l6);
      }

      if (this.u9(1)) {
         var1.n5(this.k5);
      }

      if (this.u9(4)) {
         this.u3.n5(var1);
      }

      if (this.u9(8)) {
         var1.n5(this.a6[0]);
      }

      if (this.u9(256)) {
         var1.n5(this.u9[0]);
      }

      if (this.u9(16)) {
         var1.n5(this.a6[1]);
      }

      if (this.u9(512)) {
         var1.n5(this.u9[1]);
      }

      if (this.u9(32)) {
         var1.n5(this.a6[2]);
      }

      if (this.u9(1024)) {
         var1.n5(this.u9[2]);
      }

      if (this.u9(64)) {
         var1.n5(this.a6[3]);
      }

      if (this.u9(2048)) {
         var1.n5(this.u9[3]);
      }

      if (this.u9(128)) {
         var1.n5(this.a6[4]);
      }

      if (this.u9(4096)) {
         var1.n5(this.u9[4]);
      }
   }

   final int y4() {
      int var1 = 4;
      if (this.u9(2)) {
         var1 += 2;
      }

      if (this.u9(1)) {
         var1 += 2;
      }

      if (this.u9(4)) {
         var1 += this.u3.n5();
      }

      if (this.u9(8)) {
         var1 += 2;
      }

      if (this.u9(256)) {
         var1 += 2;
      }

      if (this.u9(16)) {
         var1 += 2;
      }

      if (this.u9(512)) {
         var1 += 2;
      }

      if (this.u9(32)) {
         var1 += 2;
      }

      if (this.u9(1024)) {
         var1 += 2;
      }

      if (this.u9(64)) {
         var1 += 2;
      }

      if (this.u9(2048)) {
         var1 += 2;
      }

      if (this.u9(128)) {
         var1 += 2;
      }

      if (this.u9(4096)) {
         var1 += 2;
      }

      return var1;
   }

   public final n1g e2() {
      return (n1g)this.t9();
   }

   private int l6(int var1) {
      return var1 >= 0 && var1 <= 4 ? 4 << var1 + 1 : 0;
   }

   private int k5(int var1) {
      return var1 >= 0 && var1 <= 4 ? 128 << var1 + 1 : 0;
   }

   private com.aspose.slides.ms.System.o5<Short> u3(int var1) {
      int var2 = this.l6(var1);
      return this.u9(var2) ? new com.aspose.slides.ms.System.o5<>(this.a6[var1]) : new com.aspose.slides.ms.System.o5<>();
   }

   private void n5(int var1, com.aspose.slides.ms.System.o5<Short> var2) {
      int var3 = this.l6(var1);
      if (var3 == 0) {
         throw new ArgumentNullException();
      }

      if (var2.l6()) {
         this.a6[var1] = (Short)var2.n5();
      }

      this.n5(var3, var2.l6());
   }

   private com.aspose.slides.ms.System.o5<Short> a6(int var1) {
      int var2 = this.k5(var1);
      return this.u9(var2) ? new com.aspose.slides.ms.System.o5<>(this.u9[var1]) : new com.aspose.slides.ms.System.o5<>();
   }

   private void l6(int var1, com.aspose.slides.ms.System.o5<Short> var2) {
      int var3 = this.k5(var1);
      if (var3 == 0) {
         throw new ArgumentNullException();
      }

      if (var2.l6()) {
         this.u9[var1] = (Short)var2.n5();
      }

      this.n5(var3, var2.l6());
   }

   private boolean u9(int var1) {
      return (this.n5 & var1 & 4294967295L & 4294967295L) != 0L;
   }

   private void n5(int var1, boolean var2) {
      this.n5 = this.n5 & (4294967295L ^ var1 & 4294967295L) & 4294967295L;
      if (var2) {
         this.n5 = (this.n5 | var1 & 4294967295L) & 4294967295L;
      }
   }

   protected Object t9() {
      try {
         n1g var1 = (n1g)super.clone();
         var1.u3 = this.u3.l6();
         if (this.u9 != null) {
            var1.u9 = Arrays.copyOf(this.u9, this.u9.length);
         }

         if (this.a6 != null) {
            var1.a6 = Arrays.copyOf(this.a6, this.a6.length);
         }

         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n1g cloneT() {
      return this.e2();
   }

}
