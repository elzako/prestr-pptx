package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class g1a extends b3 {
   private t4j n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("notesMasterId");

   public g1a(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new g1a$1(this, var1));
   }

   public g1a() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("p", var2, "notesMasterId");
      }

      var2.s7();
   }

   public final t4j n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <notesMasterId> element can be added.");
      }

      this.n5 = new t4j();
      return this.n5;
   }

   public final t4j l6() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static t4j n5(g1a var0, t4j var1) {
      return var0.n5 = var1;
   }
}
