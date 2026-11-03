package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public class m8 extends e0 {
   private x7 n5;
   private w5 k5;
   private e0 u3;

   public m8(x7 var1, boolean var2, XmlDocument var3) {
      super(var3);
      this.parentNode = null;
      if (!var3.isLoading()) {
         XmlDocument.checkName(var1.s7());
         XmlDocument.checkName(var1.c8());
      }

      if (var1.c8().length() == 0) {
         throw new ArgumentException(v3.n5("The local name for elements or attributes cannot be null or an empty string."));
      }

      this.n5 = var1;
      if (var2) {
         this.u3 = this;
      }
   }

   public m8(String var1, String var2, String var3, XmlDocument var4) {
      this(var4.addXmlName(var1, var2, var3, null), true, var4);
   }

   public final x7 c8() {
      return this.n5;
   }

   public final void n5(x7 var1) {
      this.n5 = var1;
   }

   @Override
   public l0 cloneNode(boolean deep) {
      XmlDocument var2 = this.getOwnerDocument();
      boolean var3 = var2.isLoading();
      var2.setLoading(true);
      m8 var4 = var2.createElement(this.getPrefix(), this.getLocalName(), this.getNamespaceURI());
      var2.setLoading(var3);
      if (var4.t2() != this.t2()) {
         var4.l6(this.t2());
      }

      if (this.s7()) {
         IEnumerator var5 = this.getAttributes().iterator();

         try {
            while (var5.hasNext()) {
               u8 var6 = (u8)var5.next();
               u8 var7 = (u8)var6.cloneNode(true);
               if (com.aspose.slides.internal.v6g.k5.l6(var6, o4.class) && !var6.a6()) {
                  ((o4)var7).n5(false);
               }

               var4.getAttributes().c8(var7);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               ((IDisposable)var5).dispose();
            }
         }
      }

      if (deep) {
         var4.copyChildren(var2, this, deep);
      }

      return var4;
   }

   @Override
   public String getName() {
      return this.n5.n3();
   }

   @Override
   public String getLocalName() {
      return this.n5.c8();
   }

   @Override
   public String getNamespaceURI() {
      return this.n5.t2();
   }

   @Override
   public String getPrefix() {
      return this.n5.s7();
   }

   @Override
   public void setPrefix(String value) {
      this.n5 = this.n5.x8().addXmlName(value, this.getLocalName(), this.getNamespaceURI(), this.getSchemaInfo());
   }

   @Override
   public int getNodeType() {
      return 1;
   }

   @Override
   public l0 getParentNode() {
      return this.parentNode;
   }

   @Override
   public XmlDocument getOwnerDocument() {
      return this.n5.x8();
   }

   @Override
   public boolean isContainer() {
      return true;
   }

   @Override
   public l0 appendChildForLoad(l0 newChild, XmlDocument doc) {
      p9 var3 = doc.getInsertEventArgsForLoad(newChild, this);
      if (var3 != null) {
         doc.beforeEvent(var3);
      }

      e0 var4 = (e0)newChild;
      if (this.u3 != null && this.u3 != this) {
         e0 var5 = this.u3;
         var4.l6 = var5.l6;
         var5.l6 = var4;
         this.u3 = var4;
         if (var5.isText() && var4.isText()) {
            nestTextNodes(var5, var4);
         } else {
            var4.setParentForLoad(this);
         }
      } else {
         var4.l6 = var4;
         this.u3 = var4;
         var4.setParentForLoad(this);
      }

      if (var3 != null) {
         doc.afterEvent(var3);
      }

      return var4;
   }

   public final boolean t2() {
      return this.u3 == this;
   }

   public final void l6(boolean var1) {
      if (var1) {
         if (this.u3 != this) {
            this.n3();
            this.u3 = this;
         }
      } else if (this.u3 == this) {
         this.u3 = null;
      }
   }

   @Override
   public e0 getLastNode() {
      return this.u3 == this ? null : this.u3;
   }

   @Override
   public void setLastNode(e0 value) {
      this.u3 = value;
   }

   @Override
   public boolean isValidChildType(int type) {
      switch (type) {
         case 1:
         case 3:
         case 4:
         case 5:
         case 7:
         case 8:
         case 13:
         case 14:
            return true;
         case 2:
         case 6:
         case 9:
         case 10:
         case 11:
         case 12:
         default:
            return false;
      }
   }

   @Override
   public w5 getAttributes() {
      if (this.k5 == null) {
         synchronized (this.getOwnerDocument().objLock) {
            if (this.k5 == null) {
               this.k5 = new w5(this);
            }
         }
      }

      return this.k5;
   }

   public boolean s7() {
      return this.k5 == null ? false : this.k5.l6() > 0;
   }

   public String n5(String var1) {
      u8 var2 = this.l6(var1);
      return var2 != null ? var2.getValue() : com.aspose.slides.ms.System.d1.n5;
   }

   public void k5(String var1, String var2) {
      u8 var3 = this.l6(var1);
      if (var3 == null) {
         var3 = this.getOwnerDocument().createAttribute(var1);
         var3.setValue(var2);
         this.getAttributes().c8(var3);
      } else {
         var3.setValue(var2);
      }
   }

   public u8 l6(String var1) {
      return this.s7() ? this.getAttributes().n5(var1) : null;
   }

   public u8 n5(u8 var1) {
      if (var1.u9() != null) {
         throw new InvalidOperationException(v3.n5("The 'Attribute' node cannot be inserted because it is already an attribute of another element."));
      } else {
         return (u8)this.getAttributes().n5((l0)var1);
      }
   }

   public i0 k5(String var1) {
      return new b9(this, var1);
   }

   public String u3(String var1, String var2) {
      u8 var3 = this.a6(var1, var2);
      return var3 != null ? var3.getValue() : com.aspose.slides.ms.System.d1.n5;
   }

   public String n5(String var1, String var2, String var3) {
      u8 var4 = this.a6(var1, var2);
      if (var4 == null) {
         var4 = this.getOwnerDocument().createAttribute(com.aspose.slides.ms.System.d1.n5, var1, var2);
         var4.setValue(var3);
         this.getAttributes().c8(var4);
      } else {
         var4.setValue(var3);
      }

      return var3;
   }

   public u8 a6(String var1, String var2) {
      return this.s7() ? this.getAttributes().n5(var1, var2) : null;
   }

   public boolean u3(String var1) {
      return this.l6(var1) != null;
   }

   public boolean u9(String var1, String var2) {
      return this.a6(var1, var2) != null;
   }

   @Override
   public void writeTo(l1 w) {
      if (com.aspose.slides.ms.System.j8.n5(this) == com.aspose.slides.internal.v6g.k5.n5(m8.class)) {
         n5(w, this);
      } else {
         this.n5(w);
         if (this.t2()) {
            w.s7();
         } else {
            this.writeContentTo(w);
            w.x8();
         }
      }
   }

   private static void n5(l1 var0, m8 var1) {
      m8 var2 = var1;
      l0 var3 = var1;

      while (true) {
         var1 = com.aspose.slides.internal.v6g.k5.n5(var3, m8.class);
         if (var1 != null && com.aspose.slides.ms.System.j8.n5(var1) == com.aspose.slides.internal.v6g.k5.n5(m8.class)) {
            var1.n5(var0);
            if (var1.t2()) {
               var0.s7();
            } else {
               if (var1.u3 != null) {
                  var3 = var1.getFirstChild();
                  continue;
               }

               var0.x8();
            }
         } else {
            var3.writeTo(var0);
         }

         while (var3 != var2 && var3 == var3.getParentNode().getLastChild()) {
            var3 = var3.getParentNode();
            var0.x8();
         }

         if (var3 == var2) {
            return;
         }

         var3 = var3.getNextSibling();
      }
   }

   private void n5(l1 var1) {
      var1.n5(this.getPrefix(), this.getLocalName(), this.getNamespaceURI());
      if (this.s7()) {
         w5 var2 = this.getAttributes();

         for (int var3 = 0; var3 < var2.l6(); var3++) {
            u8 var4 = var2.n5(var3);
            var4.writeTo(var1);
         }
      }
   }

   @Override
   public void writeContentTo(l1 w) {
      for (l0 var2 = this.getFirstChild(); var2 != null; var2 = var2.getNextSibling()) {
         var2.writeTo(w);
      }
   }

   public void x8() {
      if (this.s7()) {
         this.k5.n5();
      }
   }

   @Override
   public void removeAll() {
      super.removeAll();
      this.x8();
   }

   public final void n3() {
      super.removeAll();
   }

   @Override
   public com.aspose.slides.internal.b8c.u4 getSchemaInfo() {
      return this.n5;
   }

   @Override
   public String getInnerXml() {
      return super.getInnerXml();
   }

   @Override
   public void setInnerXml(String value) {
      this.n3();
      i2 var2 = new i2();
      var2.n5(this, value);
   }

   @Override
   public String getInnerText() {
      return super.getInnerText();
   }

   @Override
   public void setInnerText(String value) {
      e0 var2 = this.getLastNode();
      if (var2 != null && var2.getNodeType() == 3 && var2.l6 == var2) {
         var2.setValue(value);
      } else {
         this.n3();
         this.appendChild(this.getOwnerDocument().createTextNode(value));
      }
   }

   @Override
   public l0 getNextSibling() {
      return this.parentNode != null && this.parentNode.getLastNode() != this ? this.l6 : null;
   }

   @Override
   public void setParent(l0 node) {
      this.parentNode = node;
   }

   @Override
   public int getXPNodeType() {
      return 1;
   }

   @Override
   public String getXPLocalName() {
      return this.getLocalName();
   }

   @Override
   public String getXPAttribute(String localName, String ns) {
      if (com.aspose.slides.ms.System.d1.a6(ns, this.getOwnerDocument().strReservedXmlns)) {
         return null;
      }

      u8 var3 = this.a6(localName, ns);
      return var3 != null ? var3.getValue() : com.aspose.slides.ms.System.d1.n5;
   }
}
