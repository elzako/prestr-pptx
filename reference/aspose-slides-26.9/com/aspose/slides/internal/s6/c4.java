package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;

public class c4 implements IGenericEnumerable<o0$n5> {
   private v3[] n5;
   private v3[] l6;
   private s0[] k5;
   private int[] u3;
   private int a6;
   private short u9;

   public c4(int var1) {
      this.a6 = var1;
   }

   public final v3[] n5() {
      return this.n5;
   }

   public final void n5(v3[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.n5 = var1;
   }

   public final void l6(v3[] var1) {
      this.l6 = var1;
   }

   public final s0[] l6() {
      return this.k5;
   }

   public final void n5(s0[] var1) {
      this.k5 = var1;
   }

   public final int[] k5() {
      return this.u3;
   }

   public final void n5(int[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Triangles");
      }

      this.u3 = var1;
   }

   public final int u3() {
      return this.a6;
   }

   public final short a6() {
      return this.u9;
   }

   public final void n5(short var1) {
      this.u9 = var1;
   }

   private c4 u9() {
      if (this.l6 == null) {
         this.l6 = (v3[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(v3.class), this.n5.length));
      }

      if (this.l6.length < this.n5.length) {
         int var1 = this.l6.length;
         v3[][] var2 = new v3[][]{this.l6};
         com.aspose.slides.ms.System.u3.n5(var2, this.n5.length);
         this.l6 = var2[0];
      }

      if (this.k5 == null) {
         this.k5 = (s0[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(s0.class), this.n5.length));
      }

      if (this.k5.length < this.n5.length) {
         int var3 = this.k5.length;
         s0[][] var4 = new s0[][]{this.k5};
         com.aspose.slides.ms.System.u3.n5(var4, this.n5.length);
         this.k5 = var4[0];
      }

      return this;
   }

   @Override
   public final IGenericEnumerator<o0$n5> iterator() {
      return new c4$n5(this);
   }

   // $VF: synthetic method
   static c4 n5(c4 var0) {
      return var0.u9();
   }

   // $VF: synthetic method
   static v3[] l6(c4 var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static v3[] k5(c4 var0) {
      return var0.l6;
   }
}
