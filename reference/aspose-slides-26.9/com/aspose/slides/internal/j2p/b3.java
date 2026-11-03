package com.aspose.slides.internal.j2p;

import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.m8;

public abstract class b3 {
   protected b3() {
   }

   public abstract m8 l6();

   public m8 n5(XmlDocument var1) {
      m8 var2 = this.l6();
      return (m8)var1.importNode(var2, true);
   }

   public abstract void n5(m8 var1);

   @Override
   public String toString() {
      String var1 = com.aspose.slides.ms.System.j8.n5(this).s7().substring(com.aspose.slides.ms.System.j8.n5(this).s7().lastIndexOf(46) + 1);
      return "System.Security.Cryptography.Xml." + var1;
   }
}
