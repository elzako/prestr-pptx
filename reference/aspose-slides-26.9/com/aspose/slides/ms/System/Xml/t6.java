package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;

public class t6 extends e0 {
   private String n5;
   private e0 k5;

   public t6(String var1, XmlDocument var2) {
      super(var2);
      if (!var2.isLoading() && var1.length() > 0 && var1.charAt(0) == '#') {
         throw new ArgumentException(v3.n5("Cannot create an 'EntityReference' node with a name starting with '#'."));
      }

      this.n5 = var2.getNameTable().n5(var1);
      var2.fEntRefNodesPresent = true;
   }

   @Override
   public String getName() {
      return this.n5;
   }

   @Override
   public String getLocalName() {
      return this.n5;
   }

   @Override
   public String getValue() {
      return null;
   }

   @Override
   public void setValue(String value) {
      throw new InvalidOperationException(v3.n5("'EntityReference' nodes have no support for setting value."));
   }

   @Override
   public int getNodeType() {
      return 5;
   }

   @Override
   public l0 cloneNode(boolean deep) {
      return this.getOwnerDocument().createEntityReference(this.n5);
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   @Override
   public boolean isContainer() {
      return true;
   }

   @Override
   public void setParent(l0 node) {
      super.setParent(node);
      if (this.getLastNode() == null && node != null && node != this.getOwnerDocument()) {
         i2 var2 = new i2();
         var2.n5(this);
      }
   }

   @Override
   public void setParentForLoad(l0 node) {
      this.setParent(node);
   }

   @Override
   public e0 getLastNode() {
      return this.k5;
   }

   @Override
   public void setLastNode(e0 value) {
      this.k5 = value;
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
   public void writeTo(l1 w) {
      w.k5(this.n5);
   }

   @Override
   public void writeContentTo(l1 w) {
      for (Object recoveredElement$var3$2324 : this) {
         l0 var3 = (l0)recoveredElement$var3$2324;
         var3.writeTo(w);
      }
   }

   @Override
   public String getBaseURI() {
      return this.getOwnerDocument().getBaseURI();
   }

   private String n5(String var1, String var2) {
      if (var1 == null) {
         return var2;
      }

      int var3 = com.aspose.slides.ms.System.d1.k5(var1, '/') + 1;
      String var4 = var1;
      if (var3 > 0 && var3 < var1.length()) {
         var4 = com.aspose.slides.ms.System.d1.l6(var1, 0, var3);
      } else if (var3 == 0) {
         var4 = com.aspose.slides.ms.System.d1.n5(new String[]{var4, "\\"});
      }

      return com.aspose.slides.ms.System.d1.n5(new String[]{var4, com.aspose.slides.ms.System.d1.n5(var2, '\\', '/')});
   }

   public final String l6() {
      h1 var1 = this.getOwnerDocument().getEntityNode(this.n5);
      if (var1 != null) {
         return var1.n5() != null && var1.n5().length() > 0 ? this.n5(var1.getBaseURI(), var1.n5()) : var1.getBaseURI();
      } else {
         return com.aspose.slides.ms.System.d1.n5;
      }
   }
}
