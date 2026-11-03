package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.s2;

public class a0 {
   private m8 n5 = null;
   private int l6 = 0;
   private String k5;

   public a0() {
      this.n5 = null;
   }

   public final void n5(int var1) {
      if (var1 <= 0) {
         throw new ArgumentOutOfRangeException("value", "The key size should be a non negative integer.");
      }

      this.l6 = var1;
      this.n5 = null;
   }

   public final String n5() {
      return this.k5;
   }

   public final m8 n5(XmlDocument var1) {
      m8 var2 = var1.createElement("EncryptionMethod", "http://www.w3.org/2001/04/xmlenc#");
      if (!com.aspose.slides.ms.System.d1.n5(this.k5)) {
         var2.k5("Algorithm", this.k5);
      }

      if (this.l6 > 0) {
         m8 var3 = var1.createElement("KeySize", "http://www.w3.org/2001/04/xmlenc#");
         var3.appendChild(var1.createTextNode(com.aspose.slides.ms.System.a3.n5(this.l6, null, null)));
         var2.appendChild(var3);
      }

      return var2;
   }

   public final void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      s2 var2 = new s2(var1.getOwnerDocument().getNameTable());
      var2.n5("enc", "http://www.w3.org/2001/04/xmlenc#");
      this.k5 = i9.k5(var1, "Algorithm", "http://www.w3.org/2001/04/xmlenc#");
      l0 var3 = var1.selectSingleNode("enc:KeySize", var2);
      if (var3 != null) {
         this.n5(com.aspose.slides.ms.System.z3.h0(i9.n5(var3.getInnerText()), null));
      }

      this.n5 = var1;
   }
}
