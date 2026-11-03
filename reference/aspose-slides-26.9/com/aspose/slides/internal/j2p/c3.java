package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.c7;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.k1;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.o8;
import com.aspose.slides.ms.System.Xml.s2;
import com.aspose.slides.ms.System.Xml.u8;
import com.aspose.slides.ms.System.Xml.x5;
import com.aspose.slides.ms.System.Xml.z9;

public class c3 extends g7 {
   private com.aspose.slides.ms.System.y8[] l6 = new com.aspose.slides.ms.System.y8[]{
      com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class),
      com.aspose.slides.internal.v6g.k5.n5(i0.class),
      com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class)
   };
   private com.aspose.slides.ms.System.y8[] k5 = new com.aspose.slides.ms.System.y8[]{com.aspose.slides.internal.v6g.k5.n5(i0.class)};
   private String u3 = com.aspose.slides.ms.System.d1.n5;
   private XmlDocument a6;
   private s2 u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("xml", "xmlns");

   public c3() {
      this.l6("http://www.w3.org/TR/1999/REC-xpath-19991116");
   }

   @Override
   public com.aspose.slides.ms.System.y8[] h0() {
      return this.l6;
   }

   @Override
   public void n5(i0 var1) {
      if (var1 == null) {
         throw new CryptographicException("Unknown transform has been encountered.");
      }

      IEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            l0 var3 = (l0)var2.next();
            String var4 = null;
            String var5 = null;
            m8 var6 = com.aspose.slides.internal.v6g.k5.n5(var3, m8.class);
            if (var6 != null) {
               if (!"XPath".equals(var6.getLocalName())) {
                  throw new CryptographicException("Unknown transform has been encountered.");
               }

               this.u3 = com.aspose.slides.ms.System.d1.k5(var6.getInnerXml(), (char[])null);
               x5 var7 = new x5(var6);
               z9 var8 = var7.y1();
               this.u9 = new s2(var8);
               if (!i9.n5(var6, (String)null)) {
                  throw new CryptographicException("Unknown transform has been encountered.");
               }

               IEnumerator var9 = var6.getAttributes().iterator();

               try {
                  while (var9.hasNext()) {
                     u8 var10 = (u8)var9.next();
                     if ("xmlns".equals(var10.getPrefix())) {
                        var4 = var10.getLocalName();
                        var5 = var10.getValue();
                        if (var4 == null) {
                           var4 = var6.getPrefix();
                           var5 = var6.getNamespaceURI();
                        }

                        this.u9.n5(var4, var5);
                     }
                  }
                  break;
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                     ((IDisposable)var9).dispose();
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            ((IDisposable)var2).dispose();
         }
      }

      if (this.u3 == null) {
         throw new CryptographicException("Unknown transform has been encountered.");
      }
   }

   @Override
   protected i0 c8() {
      XmlDocument var1 = new XmlDocument();
      m8 var2 = var1.createElement(null, "XPath", "http://www.w3.org/2000/09/xmldsig#");
      if (this.u9 != null) {
         IEnumerator var3 = this.u9.iterator();

         try {
            while (var3.hasNext()) {
               String var4 = (String)var3.next();
               switch (h0.n5(var4)) {
                  case 0:
                  case 1:
                     break;
                  default:
                     if (var4 != null && var4.length() > 0) {
                        var2.k5(com.aspose.slides.ms.System.d1.n5(new String[]{"xmlns:", var4}), this.u9.n5(var4));
                     }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               ((IDisposable)var3).dispose();
            }
         }
      }

      var2.setInnerXml(this.u3);
      var1.appendChild(var2);
      return var1.getChildNodes();
   }

   @Override
   public void n5(Object var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.z0k.t4.class)) {
         this.n5((com.aspose.slides.internal.z0k.t4)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, i0.class)) {
         this.l6((i0)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, XmlDocument.class)) {
         this.l6((XmlDocument)var1);
      }
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1) {
      o8 var2 = this.u9() ? this.n5 : new k1();
      c7 var3 = i9.n5(var1, var2, this.n5());
      this.a6 = new XmlDocument();
      this.a6.setPreserveWhitespace(true);
      this.a6.load(var3);
   }

   private void l6(i0 var1) {
      o8 var2 = this.u9() ? this.n5 : new k1();
      u3 var3 = new u3(var1, var2, true);
      com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(var3.n5());

      try {
         this.n5(var4);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   private void l6(XmlDocument var1) {
      this.a6 = var1;
   }

   @Override
   public Object t2() {
      x8 var1 = new x8();
      if (!com.aspose.slides.ms.System.d1.n5(this.u3)) {
         com.aspose.slides.internal.x6s.a6 var2 = this.a6.createNavigator();
         com.aspose.slides.internal.x6s.h0 var3 = var2.u9("//. | //@*");
         com.aspose.slides.internal.x6s.k5 var4 = var2.a6(com.aspose.slides.ms.System.d1.n5(new String[]{"boolean(", this.u3, ")"}));
         var4.n5(this.u9);

         while (var3.l6()) {
            l0 var5 = ((com.aspose.slides.ms.System.Xml.h2)var3.k5()).m3();
            boolean var6 = com.aspose.slides.internal.v6g.k5.u3(var3.k5().l6(var4), boolean.class);
            if (var6) {
               var1.addItem(var5);
            }
         }

         var3 = var2.u9("//namespace::*");

         while (var3.l6()) {
            l0 var8 = ((com.aspose.slides.ms.System.Xml.h2)var3.k5()).m3();
            var1.addItem(var8);
         }
      }

      return var1;
   }

   @Override
   public Object l6(com.aspose.slides.ms.System.y8 var1) {
      if (var1 != com.aspose.slides.internal.v6g.k5.n5(i0.class) && !var1.n5(com.aspose.slides.internal.v6g.k5.n5(i0.class))) {
         throw new ArgumentException("The input type was invalid for this transform.", "type");
      } else {
         return (i0)this.t2();
      }
   }
}
