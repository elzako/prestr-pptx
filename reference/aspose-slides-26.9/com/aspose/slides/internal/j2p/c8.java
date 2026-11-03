package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.d3;
import com.aspose.slides.ms.System.Xml.h5;
import com.aspose.slides.ms.System.Xml.j1;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.n8;
import com.aspose.slides.ms.System.Xml.t0;
import com.aspose.slides.ms.System.Xml.t6;
import com.aspose.slides.ms.System.Xml.u5;
import com.aspose.slides.ms.System.Xml.u8;

public class c8 extends XmlDocument implements f2 {
   private boolean n5;
   private boolean l6;
   private boolean k5;

   public c8(boolean var1, boolean var2) {
      this.setPreserveWhitespace(true);
      this.l6 = var2;
      this.k5 = this.n5 = var1;
   }

   @Override
   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   @Override
   public final void n5(com.aspose.slides.internal.l7h.a5 var1, int var2, n5 var3) {
      byte var9 = 0;
      IEnumerator var4 = this.getChildNodes().iterator();

      try {
         while (var4.hasNext()) {
            l0 var5 = (l0)var4.next();
            if (var5.getNodeType() == 1) {
               z1.n5(var5, var1, 1, var3);
               var9 = 2;
            } else {
               z1.n5(var5, var1, var9, var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            ((IDisposable)var4).dispose();
         }
      }
   }

   @Override
   public final void n5(com.aspose.slides.internal.o8m.f2 var1, int var2, n5 var3) {
      byte var9 = 0;
      IEnumerator var4 = this.getChildNodes().iterator();

      try {
         while (var4.hasNext()) {
            l0 var5 = (l0)var4.next();
            if (var5.getNodeType() == 1) {
               z1.n5(var5, var1, 1, var3);
               var9 = 2;
            } else {
               z1.n5(var5, var1, var9, var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            ((IDisposable)var4).dispose();
         }
      }
   }

   @Override
   public m8 createElement(String prefix, String localName, String namespaceURI) {
      return new t2(prefix, localName, namespaceURI, this, this.n5);
   }

   @Override
   public u8 createAttribute(String prefix, String localName, String namespaceURI) {
      return new a6(prefix, localName, namespaceURI, this, this.n5);
   }

   @Override
   public u8 createDefaultAttribute(String prefix, String localName, String namespaceURI) {
      return new a6(prefix, localName, namespaceURI, this, this.n5);
   }

   @Override
   public t0 createTextNode(String text) {
      return new e2(text, this, this.n5);
   }

   @Override
   public d3 createWhitespace(String prefix) {
      return new t9(prefix, this, this.n5);
   }

   @Override
   public n8 createSignificantWhitespace(String text) {
      return new y4(text, this, this.n5);
   }

   @Override
   public j1 createProcessingInstruction(String target, String data) {
      return new n3(target, data, this, this.n5);
   }

   @Override
   public h5 createComment(String data) {
      return new h0(data, this, this.n5, this.l6);
   }

   @Override
   public t6 createEntityReference(String name) {
      return new s7(name, this, this.n5);
   }

   @Override
   public u5 createCDataSection(String data) {
      return new u9(data, this, this.n5);
   }
}
