package com.aspose.slides.internal.z4;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.d1;

public class k7 {
   private com.aspose.slides.internal.d0.n5 n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6 = 3;
   private int u9 = 0;
   private boolean h0 = true;
   private int c8 = 95;
   private boolean t2;
   private int s7 = 0;
   private boolean x8;
   private boolean n3 = true;
   private boolean y4 = false;
   private h0 e2 = new h0();
   private l6 t9 = new l6();
   private int z1 = 2;
   private com.aspose.slides.internal.p1s.n5 t4 = com.aspose.slides.internal.p1s.n5.x3;
   private boolean q0 = false;
   private com.aspose.slides.internal.g3.l6 z3;
   private long m1 = 8L;
   private com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> k7;
   private boolean m3;

   public final void n5() {
      if (this.y4()) {
         if (this.z1()) {
            throw new ArgumentException("You have requested both PDF/A compliance and PDF encryption but these options cannot be used together.");
         }

         if (this.u9() == 2) {
            throw new ArgumentException("LZW text compression algorithm does not conforms with PDF/A standard.");
         }

         if (this.h0() == 3 || this.h0() == 4) {
            throw new ArgumentException("LZW image compression algorithms does not conforms with PDF/A standard.");
         }
      }

      if (this.n5 != null) {
         if (!com.aspose.slides.internal.n2d.t4.l6(this.n5.n5()) && !com.aspose.slides.internal.n2d.t4.l6(this.n5.l6())) {
            throw new ArgumentException("You have requested PDF encryption, but not specified either a user password or an owner password.");
         }

         if (d1.a6(this.n5.n5(), this.n5.l6())) {
            throw new ArgumentException("The PDF user password and owner password cannot be the same. Please enter different passwords.");
         }
      }
   }

   public final boolean l6() {
      switch (this.s7) {
         case 3:
         case 4:
         case 5:
         case 7:
         case 9:
         case 10:
            return true;
         case 6:
         case 8:
         default:
            return false;
      }
   }

   public final int k5() {
      return this.l6;
   }

   public final int u3() {
      return this.k5;
   }

   public final int a6() {
      return this.u3;
   }

   public final int u9() {
      return this.a6;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final int h0() {
      return this.u9;
   }

   public final boolean c8() {
      return this.h0;
   }

   public final void n5(boolean var1) {
      this.h0 = var1;
   }

   public final int t2() {
      return this.c8;
   }

   public final void l6(int var1) {
      if (var1 >= 0 && var1 <= 100) {
         this.c8 = var1;
      } else {
         throw new ArgumentException("value");
      }
   }

   public final boolean s7() {
      return this.t2;
   }

   public final int x8() {
      return this.s7;
   }

   public final void k5(int var1) {
      this.s7 = var1;
   }

   public final h0 n3() {
      return this.e2;
   }

   public final boolean y4() {
      switch (this.s7) {
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 10:
            return true;
         case 9:
         default:
            return false;
      }
   }

   public final boolean e2() {
      return this.s7 != 3 && this.s7 != 4;
   }

   public final com.aspose.slides.internal.d0.n5 t9() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.d0.n5 var1) {
      this.n5 = var1;
   }

   public final boolean z1() {
      return this.n5 != null;
   }

   public final com.aspose.slides.internal.p1s.n5 t4() {
      return this.t4;
   }

   public final void n5(com.aspose.slides.internal.p1s.n5 var1) {
      this.t4 = var1;
   }

   public final boolean q0() {
      return this.q0;
   }

   public final void l6(boolean var1) {
      this.q0 = var1;
   }

   public final boolean z3() {
      return this.x8;
   }

   public final l6 m1() {
      return this.t9;
   }

   public final int k7() {
      return this.z1;
   }

   public final void u3(int var1) {
      this.z1 = var1;
   }

   public final com.aspose.slides.internal.g3.l6 m3() {
      return this.z3;
   }

   public final void n5(com.aspose.slides.internal.g3.l6 var1) {
      this.z3 = var1;
   }

   public final long z8() {
      return this.m1;
   }

   public final com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> j5() {
      return this.k7;
   }

   public final void n5(com.aspose.slides.internal.t4r.n5<com.aspose.slides.internal.k9.h0, com.aspose.slides.internal.k9.u9> var1) {
      this.k7 = var1;
   }

   public final boolean w1() {
      return this.m3;
   }
}
