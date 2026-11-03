package com.aspose.slides.internal.z4;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.ms.System.d1;

public class u3 extends z1 implements k5 {
   private com.aspose.slides.internal.o9b.y1 n5;
   private final com.aspose.slides.internal.h3.u9 k5;
   private int u3;
   private String a6;

   public u3(c8 var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.h3.u9 var3) {
      super(var1);
      this.n5 = com.aspose.slides.internal.o9b.y1.n5.y4();
      this.u3 = -1;
      var2.a6(this.n5);
      this.k5 = var3;
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this);
      var1.c8();
      var1.k5("/Type", "/Annot");
      var1.k5("/Subtype", "/Link");
      if (this.u3 > -1) {
         var1.n5("/StructParent", this.u3);
      }

      if (!d1.n5(this.a6)) {
         var1.u3("/Contents", this.a6);
      }

      if (this.l6.e2()) {
         var1.n5("/F", 28);
      }

      var1.n5("/Rect", this.n5.y4());
      if (!this.l6.l6().s7()) {
         var1.k5("/BS", "<</Type/Border/S/S/W 0>>");
      }

      if (this.k5 != null) {
         this.k5.n5(var1);
      }

      var1.t2();
      var1.l6();
   }

   @Override
   public final void n5(t4 var1, IGenericDictionary<String, t2> var2, IGenericDictionary<String, t2> var3) {
      if (this.k5 != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.k5, com.aspose.slides.internal.h3.a6.class)) {
            ((com.aspose.slides.internal.h3.a6)this.k5).n5(var3);
         }

         com.aspose.slides.internal.h3.l6 var4 = com.aspose.slides.internal.v6g.k5.n5(this.k5, com.aspose.slides.internal.h3.n5.class);
         if (var4 != null) {
            var4.n5(var3);
         }

         var4 = com.aspose.slides.internal.v6g.k5.n5(this.k5, com.aspose.slides.internal.h3.k5.class);
         if (var4 != null) {
            var4.n5(var2);
         }
      }

      this.n5(var1);
   }

   public final com.aspose.slides.internal.o9b.y1 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.o9b.y1 var1) {
      var1.a6(this.n5);
   }

   public final com.aspose.slides.internal.h3.u9 l6() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final String k5() {
      return this.a6;
   }

   public final void n5(String var1) {
      this.a6 = var1;
   }
}
