package com.aspose.slides.internal.u3r;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.j1;
import com.aspose.slides.ms.System.Xml.l0;

class t9 extends e2 implements u9 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("r", "w");

   @Override
   public final com.aspose.slides.internal.t6q.n3 n5(XmlDocument var1) {
      if (var1 == null) {
         throw new ArgumentNullException("xmlDocument");
      }

      l0 var2 = var1.getLastChild();
      l0 var3 = null;
      switch (var2.getNodeType()) {
         case 7:
            var3 = var2;
            break;
         case 13:
            if (var2 != null && var2.getNodeType() == 13 && var2.getPreviousSibling() != null && var2.getPreviousSibling().getNodeType() == 7) {
               var3 = var2.getPreviousSibling();
            }
      }

      if (var3 == null) {
         throw new com.aspose.slides.internal.z3b.s7(d1.n5("Invalid XMP structure. Trailer not found. XMP: {0}", new Object[]{var1.getInnerXml()}));
      }

      j1 var4 = (j1)var3;
      if (!d1.u3(var4.l6(), "xpacket", (short)5)) {
         throw new com.aspose.slides.internal.z3b.s7(d1.n5("Invalid XMP structure. Invalid trailer. XMP: {0}", new Object[]{var1.getInnerXml()}));
      }

      String var5 = null;
      String[] var6 = new String[]{var5};
      boolean var7 = !this.a6.n5(var4, "end", var6);
      var5 = var6[0];
      if (var7) {
         throw new com.aspose.slides.internal.z3b.s7(d1.n5("Invalid XMP structure. Read-write attribute not found. XMP: {0}", new Object[]{var1.getInnerXml()}));
      }

      if (d1.n5(var5)) {
         throw new com.aspose.slides.internal.z3b.s7(d1.n5("Invalid XMP structure. Invalid trailer. XMP: {0}", new Object[]{var1.getInnerXml()}));
      }

      boolean var8;
      switch (n5.n5(d1.u9(var5))) {
         case 0:
            var8 = false;
            break;
         case 1:
            var8 = true;
            break;
         default:
            throw new com.aspose.slides.internal.z3b.s7(
               d1.n5("Invalid XMP structure. Invalid read-write attribute. XMP: {0}", new Object[]{var1.getInnerXml()})
            );
      }

      return new com.aspose.slides.internal.t6q.n3(var8);
   }
}
