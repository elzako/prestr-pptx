package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;

public class t5 extends l0 {
   private e0 n5;

   public t5(XmlDocument var1) {
      if (var1 == null) {
         throw new ArgumentException(v3.n5("Cannot create a node without an owner document."));
      }

      this.parentNode = var1;
   }

   @Override
   public String getName() {
      return this.getOwnerDocument().strDocumentFragmentName;
   }

   @Override
   public String getLocalName() {
      return this.getOwnerDocument().strDocumentFragmentName;
   }

   @Override
   public int getNodeType() {
      return 11;
   }

   @Override
   public l0 getParentNode() {
      return null;
   }

   @Override
   public XmlDocument getOwnerDocument() {
      return (XmlDocument)this.parentNode;
   }

   @Override
   public String getInnerXml() {
      return super.getInnerXml();
   }

   @Override
   public void setInnerXml(String value) {
      this.removeAll();
      i2 var2 = new i2();
      var2.n5(this, value, 1);
   }

   @Override
   public l0 cloneNode(boolean deep) {
      XmlDocument var2 = this.getOwnerDocument();
      t5 var3 = var2.createDocumentFragment();
      if (deep) {
         var3.copyChildren(var2, this, deep);
      }

      return var3;
   }

   @Override
   public boolean isContainer() {
      return true;
   }

   @Override
   public e0 getLastNode() {
      return this.n5;
   }

   @Override
   public void setLastNode(e0 value) {
      this.n5 = value;
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
         case 15:
         case 16:
         default:
            return false;
         case 17:
            l0 var2 = this.getFirstChild();
            return var2 == null || var2.getNodeType() != 17;
      }
   }

   @Override
   public boolean canInsertAfter(l0 newChild, l0 refChild) {
      if (newChild.getNodeType() == 17) {
         return refChild == null ? this.getLastNode() == null : false;
      } else {
         return true;
      }
   }

   @Override
   public boolean canInsertBefore(l0 newChild, l0 refChild) {
      return newChild.getNodeType() != 17 ? true : refChild == null || refChild == this.getFirstChild();
   }

   @Override
   public void writeTo(l1 w) {
      this.writeContentTo(w);
   }

   @Override
   public void writeContentTo(l1 w) {
      for (Object recoveredElement$var3$2638 : this) {
         l0 var3 = (l0)recoveredElement$var3$2638;
         var3.writeTo(w);
      }
   }

   @Override
   public int getXPNodeType() {
      return 0;
   }
}
