package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.k1;
import com.aspose.slides.ms.System.Xml.o8;

public class p6 extends g7 {
   private com.aspose.slides.ms.System.y8[] l6 = new com.aspose.slides.ms.System.y8[]{
      com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class),
      com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class),
      com.aspose.slides.internal.v6g.k5.n5(i0.class)
   };
   private com.aspose.slides.ms.System.y8[] k5 = new com.aspose.slides.ms.System.y8[]{
      com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class)
   };
   private u3 u3;
   private boolean a6 = false;

   public p6() {
      this.l6("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
   }

   public p6(boolean var1) {
      this.a6 = var1;
      this.l6(var1 ? "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments" : "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
   }

   @Override
   public com.aspose.slides.ms.System.y8[] h0() {
      return this.l6;
   }

   @Override
   public void n5(i0 var1) {
      if (var1 != null && var1.n5() > 0) {
         throw new CryptographicException("Unknown transform has been encountered.");
      }
   }

   @Override
   protected i0 c8() {
      return null;
   }

   @Override
   public void n5(Object var1) {
      o8 var2 = this.u9() ? this.n5 : new k1();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.z0k.t4.class)) {
         this.u3 = new u3((com.aspose.slides.internal.z0k.t4)var1, this.a6, var2, this.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, XmlDocument.class)) {
         this.u3 = new u3((XmlDocument)var1, var2, this.a6);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, i0.class)) {
         this.u3 = new u3((i0)var1, var2, this.a6);
      } else {
         throw new ArgumentException("Type of input object is invalid.", "obj");
      }
   }

   @Override
   public Object t2() {
      return new com.aspose.slides.internal.z0k.e2(this.u3.n5());
   }

   @Override
   public Object l6(com.aspose.slides.ms.System.y8 var1) {
      if (var1 != com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class)
         && !var1.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class))) {
         throw new ArgumentException("The input type was invalid for this transform.", "type");
      } else {
         return new com.aspose.slides.internal.z0k.e2(this.u3.n5());
      }
   }

   @Override
   public byte[] n5(com.aspose.slides.internal.o8m.f2 var1) {
      return this.u3.n5(var1);
   }
}
