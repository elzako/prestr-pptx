package com.aspose.slides.internal.y4g;

import com.aspose.slides.ms.System.d1;

public final class t1 {
   private String n5;
   private com.aspose.slides.internal.f3c.s7 l6 = new com.aspose.slides.internal.f3c.s7();
   private com.aspose.slides.internal.f3c.u9 k5;
   private com.aspose.slides.internal.x8w.u9 u3;

   public String n5() {
      return this.n5;
   }

   public void n5(String var1) {
      this.n5 = var1;
   }

   public com.aspose.slides.internal.f3c.s7 l6() {
      return this.l6;
   }

   public void n5(com.aspose.slides.internal.f3c.s7 var1) {
      this.l6 = var1;
   }

   public com.aspose.slides.internal.f3c.u9 k5() {
      return this.k5;
   }

   public void n5(com.aspose.slides.internal.f3c.u9 var1) {
      this.k5 = var1;
      this.u3();
   }

   public t1() {
      this.n5 = d1.n5;
   }

   public void u3() {
      if (this.k5 == null) {
         this.u3 = null;
      } else {
         com.aspose.slides.internal.i2i.l6 var1 = new com.aspose.slides.internal.i2i.l6(this.k5.x8());
         this.u3 = new com.aspose.slides.internal.x8w.u9(var1.c8().n5());
         this.u3.n5(var1.c8().l6(false).n5());
      }
   }
}
