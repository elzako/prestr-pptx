package com.aspose.slides.internal.t5;

import com.aspose.slides.internal.t5n.l6$n5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.s3;

public class x8 extends q0 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private byte u9;
   private byte h0;
   private byte c8;
   private byte t2;
   private byte s7;
   private byte x8;
   private byte n3;
   private com.aspose.slides.internal.k1.t4 y4;
   private String e2;
   private com.aspose.slides.internal.o9b.n3 t9;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void k5(int var1) {
      this.k5 = var1;
   }

   public final int u3() {
      return this.u3;
   }

   public final void u3(int var1) {
      this.u3 = var1;
   }

   public final int u9() {
      return this.a6;
   }

   public final void a6(int var1) {
      this.a6 = var1;
   }

   public final byte h0() {
      return this.u9;
   }

   public final void n5(byte var1) {
      this.u9 = var1;
   }

   public final byte c8() {
      return this.h0;
   }

   public final void l6(byte var1) {
      this.h0 = var1;
   }

   public final byte t2() {
      return this.c8;
   }

   public final void k5(byte var1) {
      this.c8 = var1;
   }

   public final byte s7() {
      return this.t2;
   }

   public final void u3(byte var1) {
      this.t2 = var1;
   }

   public final byte x8() {
      return this.s7;
   }

   public final void a6(byte var1) {
      this.s7 = var1;
   }

   public final byte n3() {
      return this.x8;
   }

   public final void u9(byte var1) {
      this.x8 = var1;
   }

   public final byte y4() {
      return this.n3;
   }

   public final void h0(byte var1) {
      this.n3 = var1;
   }

   public final com.aspose.slides.internal.k1.t4 e2() {
      return this.y4;
   }

   public final void n5(com.aspose.slides.internal.k1.t4 var1) {
      this.y4 = var1;
   }

   public final String t9() {
      return this.e2;
   }

   public final void n5(String var1) {
      this.e2 = var1;
      this.t9 = null;
   }

   @Override
   public String toString() {
      return d1.n5(
         "Height: {0}, Width: {1}, Escapement: {2}, Orientation: {3}, Weight: {4}, Italic: {5}, Underline: {6}, StrikeOut: {7}, CharSet: {8}, OutPrecision: {9}, ClipPrecision: {10}, Quality: {11}, PitchAndFamily: {12}, Facename: {13}",
         this.n5(),
         this.l6(),
         this.k5(),
         this.u3(),
         this.u9(),
         this.h0(),
         this.c8(),
         this.t2(),
         s3.n5(com.aspose.slides.internal.o4.u3.class, this.s7()),
         s3.n5(com.aspose.slides.internal.o4.t4.class, this.x8()),
         s3.n5(com.aspose.slides.internal.o4.a6.class, this.n3()),
         s3.n5(com.aspose.slides.internal.o4.t2.class, this.y4()),
         this.e2(),
         this.t9()
      );
   }

   protected final boolean n5(x8 var1) {
      return this.n5 == var1.n5
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && this.u9 == var1.u9
         && this.h0 == var1.h0
         && this.c8 == var1.c8
         && this.t2 == var1.t2
         && this.s7 == var1.s7
         && this.x8 == var1.x8
         && this.n3 == var1.n3
         && j8.n5(this.y4, var1.y4)
         && d1.a6(this.e2, var1.e2);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((x8)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5;
      var1 = var1 * 397 ^ this.l6;
      var1 = var1 * 397 ^ this.k5;
      var1 = var1 * 397 ^ this.u3;
      var1 = var1 * 397 ^ this.a6;
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.u9);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.h0);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.c8);
      var1 = var1 * 397 ^ this.t2 & 255;
      var1 = var1 * 397 ^ this.s7 & 255;
      var1 = var1 * 397 ^ this.x8 & 255;
      var1 = var1 * 397 ^ this.n3 & 255;
      var1 = var1 * 397 ^ (this.y4 != null ? this.y4.hashCode() : 0);
      return var1 * 397 ^ (this.e2 != null ? this.e2.hashCode() : 0);
   }

   public final com.aspose.slides.internal.o9b.n3 z1() {
      l6$n5 var1 = n5(this.t9(), this);
      if (this.t9 == null) {
         this.t9 = com.aspose.slides.internal.b0.l6.l6(var1);
      }

      return this.t9;
   }

   private static l6$n5 n5(String var0, x8 var1) {
      l6$n5 var2 = new l6$n5();
      var2.n5 = var1.n5();
      var2.l6 = var1.l6();
      var2.k5 = var1.k5();
      var2.u3 = var1.u3();
      var2.a6 = var1.u9();
      var2.u9 = var1.h0();
      var2.h0 = var1.c8();
      var2.c8 = var1.t2();
      var2.t2 = var1.s7();
      var2.s7 = var1.x8();
      var2.x8 = var1.n3();
      var2.n3 = var1.y4();
      var2.y4 = var1.e2().n5();
      var2.e2 = var0;
      return var2;
   }
}
