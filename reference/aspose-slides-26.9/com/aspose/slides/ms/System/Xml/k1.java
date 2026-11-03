package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.XmlException;
import java.util.concurrent.atomic.AtomicReference;

public class k1 extends o8 {
   private static AtomicReference<Object> n5 = new AtomicReference<>();
   private com.aspose.slides.internal.g8v.f2 l6;
   private com.aspose.slides.internal.g8v.v4 k5;
   private com.aspose.slides.internal.k1d.k5 u3;

   private static w9 n5() {
      if (n5.get() == null) {
         w9 var0 = new w9();
         n5.set(var0);
      }

      return (w9)n5.get();
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.r8 var1, String var2, com.aspose.slides.ms.System.y8 var3) {
      if (var3 != null
         && var3 != com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class)
         && var3 != com.aspose.slides.internal.v6g.k5.n5(Object.class)) {
         throw new XmlException("Object type is not supported.", com.aspose.slides.ms.System.d1.n5);
      } else {
         return n5().n5(var1, this.l6, this.k5, this.u3);
      }
   }

   @Override
   public com.aspose.slides.ms.System.r8 n5(com.aspose.slides.ms.System.r8 var1, String var2) {
      return super.n5(var1, var2);
   }
}
