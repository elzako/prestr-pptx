package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;

public class s8$n5 implements v0 {
   private s8 l6;
   private com.aspose.slides.internal.b8c.b4 k5;
   private com.aspose.slides.internal.b8c.b4 u3;
   public final com.aspose.slides.internal.v6g.n5<com.aspose.slides.internal.b8c.b4> n5 = new k4(this);

   public s8$n5(s8 var1) {
      this.l6 = var1;
   }

   @Override
   public final Object n5() {
      return this.k5;
   }

   @Override
   public final void n5(Exception var1, int var2) {
      if (this.k5 != null) {
         this.k5.n5(this.l6, new com.aspose.slides.internal.b8c.i0((XmlSchemaException)var1, var2));
      } else if (this.l6.u6() != 0 && var2 == 0) {
         throw var1;
      }
   }

   public final void n5(com.aspose.slides.internal.b8c.b4 var1) {
      if (var1 != null) {
         if (this.k5 == null) {
            this.k5 = this.u3;
         }

         this.k5.n5(var1);
      }
   }

   public final void l6(com.aspose.slides.internal.b8c.b4 var1) {
      this.k5.l6(var1);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.b8c.b4 n5(s8$n5 var0, com.aspose.slides.internal.b8c.b4 var1) {
      return var0.u3 = var1;
   }
}
