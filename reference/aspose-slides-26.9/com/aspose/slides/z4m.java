package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

class z4m {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private boolean a6;
   private k1z u9;
   private k1z h0;
   private Placeholder c8;
   private boolean t2 = false;

   z4m(k1z var1) {
      this.h0 = var1;
      this.n5(false);
      this.n5(null);
      this.c8 = (Placeholder)var1.s7().getPlaceholder();
      this.n5(0);
      this.k5(-1);
      this.u3(this.c8.getSize());
      this.s7();
   }

   private void s7() {
      y2q var1 = this.h0.a6();
      var1.t9().addItem(this);
   }

   final void n5() {
      if (!this.t2) {
         this.t2 = true;
         v0q.n5(this);
         switch (this.u3()) {
            case 0:
               com.aspose.slides.internal.k0r.m7 var3 = this.l6().w1().t2();
               if (var3 == null) {
                  var3 = new com.aspose.slides.internal.k0r.m7();
                  this.l6().w1().n5(var3);
               }

               var3.l6(this.a6());
               var3.n5(this.u9());
               var3.k5(this.h0());
               if (this.h0.a6().k5() == 4) {
                  switch (this.a6()) {
                     case 26:
                        var3.l6(19);
                        com.aspose.slides.internal.k0r.j9e var2 = new com.aspose.slides.internal.k0r.j9e();
                        var2.n5(26);
                        this.l6().w1().n5(var2);
                  }
               }
               break;
            case 1:
               com.aspose.slides.internal.k0r.o9b var1 = this.l6().w1().t4();
               if (var1 == null) {
                  var1 = new com.aspose.slides.internal.k0r.o9b();
                  this.l6().w1().n5(var1);
               }

               var1.n5(this.a6());
               break;
            case 2:
               throw new NotImplementedException("No case for NewPlaceholder container type!");
         }
      }
   }

   final k1z l6() {
      return this.h0;
   }

   final Placeholder k5() {
      return this.c8;
   }

   final int u3() {
      return this.n5;
   }

   final void n5(int var1) {
      this.n5 = var1;
   }

   final int a6() {
      return this.l6;
   }

   final void l6(int var1) {
      this.l6 = var1;
   }

   final int u9() {
      return this.k5;
   }

   final void k5(int var1) {
      this.k5 = var1;
   }

   final int h0() {
      return this.u3;
   }

   final void u3(int var1) {
      this.u3 = var1;
   }

   final boolean c8() {
      return this.a6;
   }

   final void n5(boolean var1) {
      this.a6 = var1;
   }

   final k1z t2() {
      return this.u9;
   }

   final void n5(k1z var1) {
      this.u9 = var1;
   }
}
