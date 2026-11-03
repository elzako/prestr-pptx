package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;

public class u8 extends l0 {
   private x7 n5;
   private e0 l6;

   public u8(x7 var1, XmlDocument var2) {
      super(var2);
      this.parentNode = null;
      if (!var2.isLoading()) {
         XmlDocument.checkName(var1.s7());
         XmlDocument.checkName(var1.c8());
      }

      if (var1.c8().length() == 0) {
         throw new ArgumentException(v3.n5("The attribute local name cannot be empty."));
      }

      this.n5 = var1;
   }

   public final int l6() {
      return this.n5.hashCode();
   }

   public u8(String var1, String var2, String var3, XmlDocument var4) {
      this(var4.addAttrXmlName(var1, var2, var3, null), var4);
   }

   public final x7 k5() {
      return this.n5;
   }

   public final void n5(x7 var1) {
      this.n5 = var1;
   }

   @Override
   public l0 cloneNode(boolean deep) {
      XmlDocument var2 = this.getOwnerDocument();
      u8 var3 = var2.createAttribute(this.getPrefix(), this.getLocalName(), this.getNamespaceURI());
      var3.copyChildren(var2, this, true);
      return var3;
   }

   @Override
   public l0 getParentNode() {
      return null;
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
      this.n5 = this.n5.x8().addAttrXmlName(value, this.getLocalName(), this.getNamespaceURI(), this.getSchemaInfo());
   }

   @Override
   public int getNodeType() {
      return 2;
   }

   @Override
   public XmlDocument getOwnerDocument() {
      return this.n5.x8();
   }

   @Override
   public String getValue() {
      return this.getInnerText();
   }

   @Override
   public void setValue(String value) {
      this.setInnerText(value);
   }

   @Override
   public com.aspose.slides.internal.b8c.u4 getSchemaInfo() {
      return this.n5;
   }

   @Override
   public void setInnerText(String value) {
      if (this.u3()) {
         String var2 = super.getInnerText();
         super.setInnerText(value);
         this.n5(var2);
      } else {
         super.setInnerText(value);
      }
   }

   public final boolean u3() {
      XmlDocument var1 = this.getOwnerDocument();
      if (var1.getDtdSchemaInfo() != null) {
         m8 var2 = this.u9();
         if (var2 != null) {
            return var2.getAttributes().l6(this.getPrefix(), this.getLocalName());
         }
      }

      return false;
   }

   public final void n5(String var1) {
      m8 var2 = this.u9();
      if (var2 != null) {
         var2.getAttributes().k5(var1, this.getInnerText());
      }
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
      if (this.l6 == null) {
         var4.l6 = var4;
         this.l6 = var4;
         var4.setParentForLoad(this);
      } else {
         e0 var5 = this.l6;
         var4.l6 = var5.l6;
         var5.l6 = var4;
         this.l6 = var4;
         if (var5.isText() && var4.isText()) {
            nestTextNodes(var5, var4);
         } else {
            var4.setParentForLoad(this);
         }
      }

      if (var3 != null) {
         doc.afterEvent(var3);
      }

      return var4;
   }

   @Override
   public e0 getLastNode() {
      return this.l6;
   }

   @Override
   public void setLastNode(e0 value) {
      this.l6 = value;
   }

   @Override
   public boolean isValidChildType(int type) {
      return type == 3 || type == 5;
   }

   public boolean a6() {
      return true;
   }

   @Override
   public l0 insertBefore(l0 newChild, l0 refChild) {
      l0 var4;
      if (this.u3()) {
         String var3 = this.getInnerText();
         var4 = super.insertBefore(newChild, refChild);
         this.n5(var3);
      } else {
         var4 = super.insertBefore(newChild, refChild);
      }

      return var4;
   }

   @Override
   public l0 insertAfter(l0 newChild, l0 refChild) {
      l0 var4;
      if (this.u3()) {
         String var3 = this.getInnerText();
         var4 = super.insertAfter(newChild, refChild);
         this.n5(var3);
      } else {
         var4 = super.insertAfter(newChild, refChild);
      }

      return var4;
   }

   @Override
   public l0 replaceChild(l0 newChild, l0 oldChild) {
      l0 var4;
      if (this.u3()) {
         String var3 = this.getInnerText();
         var4 = super.replaceChild(newChild, oldChild);
         this.n5(var3);
      } else {
         var4 = super.replaceChild(newChild, oldChild);
      }

      return var4;
   }

   @Override
   public l0 removeChild(l0 oldChild) {
      l0 var3;
      if (this.u3()) {
         String var2 = this.getInnerText();
         var3 = super.removeChild(oldChild);
         this.n5(var2);
      } else {
         var3 = super.removeChild(oldChild);
      }

      return var3;
   }

   @Override
   public l0 prependChild(l0 newChild) {
      l0 var3;
      if (this.u3()) {
         String var2 = this.getInnerText();
         var3 = super.prependChild(newChild);
         this.n5(var2);
      } else {
         var3 = super.prependChild(newChild);
      }

      return var3;
   }

   @Override
   public l0 appendChild(l0 newChild) {
      l0 var3;
      if (this.u3()) {
         String var2 = this.getInnerText();
         var3 = super.appendChild(newChild);
         this.n5(var2);
      } else {
         var3 = super.appendChild(newChild);
      }

      return var3;
   }

   public m8 u9() {
      return com.aspose.slides.internal.v6g.k5.n5(this.parentNode, m8.class);
   }

   @Override
   public void setInnerXml(String value) {
      this.removeAll();
      i2 var2 = new i2();
      var2.n5(this, value);
   }

   @Override
   public void writeTo(l1 w) {
      w.u3(this.getPrefix(), this.getLocalName(), this.getNamespaceURI());
      this.writeContentTo(w);
      w.l6();
   }

   @Override
   public void writeContentTo(l1 w) {
      for (l0 var2 = this.getFirstChild(); var2 != null; var2 = var2.getNextSibling()) {
         var2.writeTo(w);
      }
   }

   @Override
   public String getBaseURI() {
      return this.u9() != null ? this.u9().getBaseURI() : com.aspose.slides.ms.System.d1.n5;
   }

   @Override
   public void setParent(l0 node) {
      this.parentNode = node;
   }

   @Override
   public int getXmlSpace() {
      return this.u9() != null ? this.u9().getXmlSpace() : 0;
   }

   @Override
   public String getXmlLang() {
      return this.u9() != null ? this.u9().getXmlLang() : com.aspose.slides.ms.System.d1.n5;
   }

   @Override
   public int getXPNodeType() {
      return this.h0() ? 3 : 2;
   }

   @Override
   public String getXPLocalName() {
      return this.n5.s7().length() == 0 && "xmlns".equals(this.n5.c8()) ? com.aspose.slides.ms.System.d1.n5 : this.n5.c8();
   }

   public final boolean h0() {
      return v8.n5(this.n5.t2(), this.n5.x8().strReservedXmlns);
   }
}
