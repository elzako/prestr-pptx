package com.aspose.slides.internal.c0;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.z4.a0;
import com.aspose.slides.internal.z4.t4;
import com.aspose.slides.internal.z4.z1;
import com.aspose.slides.ms.System.d1;

public class k5 extends z1 {
   private l6 n5;
   private u3 k5;
   private a0 u3;

   public k5(com.aspose.slides.internal.z4.c8 var1, l6 var2) {
      super(var1);
      this.n5 = var2;
      switch (var2.z3()) {
         case 0:
         case 1:
            this.k5 = new u9(var1, "/CIDFontType0C");
            break;
         case 2:
            this.k5 = new a6(var1);
            break;
         case 3:
            this.k5 = new a6(var1);
            break;
         default:
            throw new InvalidOperationException("Unexpected font type.");
      }

      if (this.l6.e2()) {
         this.u3 = new a0(var1);
      }
   }

   @Override
   public void n5(t4 var1) {
      this.l6(var1);
      if (this.k5 != null) {
         this.n5.n5(this.k5.k5());
         this.k5.n5(var1);
      }

      if (this.l6.e2()) {
         byte[] var2 = this.n5.n5();

         for (int var3 = 0; var3 < var2.length; var3++) {
            this.u3.n5(var2[var3]);
         }

         this.u3.n5(var1);
      }
   }

   private void l6(t4 var1) {
      var1.n5(this);
      var1.c8();
      var1.k5("/Type", "/FontDescriptor");
      var1.k5("/FontName", d1.n5("/{0}", new Object[]{this.n5.u3()}));
      var1.n5("/StemV", 80);
      var1.n5("/Descent", this.n5.a6());
      var1.n5("/Ascent", this.n5.u9());
      var1.n5("/CapHeight", this.n5.t9());
      var1.n5("/Flags", this.n5.z1());
      var1.n5("/ItalicAngle", (float)this.n5.q0());
      var1.n5("/FontBBox", this.n5.t4().y4());
      if (this.l6.e2() && (this.l6.l6().x8() == 3 || this.l6.l6().x8() == 4)) {
         var1.k5("/CIDSet", this.u3.t2());
      }

      if (this.k5 != null) {
         var1.k5(this.k5.n5(), this.k5.t2());
      }

      var1.t2();
      var1.l6();
   }
}
