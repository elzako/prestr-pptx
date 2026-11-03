package com.aspose.slides.internal.u3r;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.j1;

class x8 extends e2 implements k5 {
   @Override
   public final com.aspose.slides.internal.t6q.a6 n5(XmlDocument var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("xmlDocument");
      }

      if (var1.getFirstChild().getNodeType() != 7) {
         throw new com.aspose.slides.internal.z3b.s7(
            d1.n5("Invalid xmp header. Xmp package should start from PI header. XMP: {0}", new Object[]{var1.getInnerXml()})
         );
      }

      j1 var3 = (j1)var1.getFirstChild();
      if (!d1.u3(var3.l6(), "xpacket", (short)5)) {
         throw new com.aspose.slides.internal.z3b.s7(
            d1.n5("Invalid xmp header. Xmp package should start from xpacket PI. XMP: {0}", new Object[]{var1.getInnerXml()})
         );
      }

      boolean var4 = false;
      String var5 = null;
      String var6 = null;
      String[] var7 = new String[]{var5};
      this.a6.n5(var3, "begin", var7);
      var5 = var7[0];
      String[] var8 = new String[]{var6};
      this.a6.n5(var3, "id", var8);
      var6 = var8[0];
      if (!d1.n5(var5) && "\ufeff".equals(var5)) {
         var4 = true;
      }

      if (!var4 && !var2) {
         throw new com.aspose.slides.internal.z3b.s7(d1.n5("Invalid xmp header. Byte order marker not found. XMP: {0}", new Object[]{var1.getInnerXml()}));
      } else {
         return new com.aspose.slides.internal.t6q.a6(var6);
      }
   }
}
