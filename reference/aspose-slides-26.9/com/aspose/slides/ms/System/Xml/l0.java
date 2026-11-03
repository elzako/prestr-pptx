package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;

public abstract class l0 implements IEnumerable, com.aspose.slides.internal.x6s.n5, com.aspose.slides.ms.System.v4 {
   public l0 parentNode;
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("default", "preserve");

   public l0() {
   }

   public l0(XmlDocument var1) {
      if (var1 == null) {
         throw new ArgumentException(v3.n5("Cannot create a node without an owner document."));
      }

      this.parentNode = var1;
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 createNavigator() {
      XmlDocument var1 = com.aspose.slides.internal.v6g.k5.n5(this, XmlDocument.class);
      if (var1 != null) {
         return var1.createNavigator(this);
      }

      XmlDocument var2 = this.getOwnerDocument();
      return var2.createNavigator(this);
   }

   public final l0 selectSingleNode(String xpath) {
      i0 var2 = this.selectNodes(xpath);
      return var2 != null ? var2.k5(0) : null;
   }

   public final l0 selectSingleNode(String xpath, s2 nsmgr) {
      com.aspose.slides.internal.x6s.a6 var3 = this.createNavigator();
      if (var3 == null) {
         return null;
      }

      com.aspose.slides.internal.x6s.k5 var4 = var3.a6(xpath);
      var4.n5(nsmgr);
      return new b5(var3.n5(var4)).k5(0);
   }

   public final i0 selectNodes(String xpath) {
      com.aspose.slides.internal.x6s.a6 var2 = this.createNavigator();
      return var2 == null ? null : new b5(var2.u9(xpath));
   }

   public final i0 selectNodes(String xpath, s2 nsmgr) {
      com.aspose.slides.internal.x6s.a6 var3 = this.createNavigator();
      if (var3 == null) {
         return null;
      }

      com.aspose.slides.internal.x6s.k5 var4 = var3.a6(xpath);
      var4.n5(nsmgr);
      return new b5(var3.n5(var4));
   }

   public abstract String getName();

   public String getValue() {
      return null;
   }

   public void setValue(String value) {
      throw new InvalidOperationException(
         com.aspose.slides.ms.System.d1.n5(
            com.aspose.slides.internal.x7n.l6.k5(),
            v3.n5("Cannot set a value on node type '{0}'."),
            com.aspose.slides.ms.System.s3.n5(a4.class, this.getNodeType())
         )
      );
   }

   public abstract int getNodeType();

   public l0 getParentNode() {
      if (this.parentNode.getNodeType() != 9) {
         return this.parentNode;
      }

      e0 var1 = com.aspose.slides.internal.v6g.k5.n5(this.parentNode.getFirstChild(), e0.class);
      if (var1 != null) {
         e0 var2 = var1;

         do {
            if (var2 == this) {
               return this.parentNode;
            }

            var2 = var2.l6;
         } while (var2 != null && var2 != var1);
      }

      return null;
   }

   public i0 getChildNodes() {
      return new z5(this);
   }

   public l0 getPreviousSibling() {
      return null;
   }

   public l0 getNextSibling() {
      return null;
   }

   public w5 getAttributes() {
      return null;
   }

   public XmlDocument getOwnerDocument() {
      return this.parentNode.getNodeType() == 9 ? (XmlDocument)this.parentNode : this.parentNode.getOwnerDocument();
   }

   public l0 getFirstChild() {
      e0 var1 = this.getLastNode();
      return var1 != null ? var1.l6 : null;
   }

   public l0 getLastChild() {
      return this.getLastNode();
   }

   public boolean isContainer() {
      return false;
   }

   public e0 getLastNode() {
      return null;
   }

   public void setLastNode(e0 value) {
   }

   public final boolean ancestorNode(l0 node) {
      for (l0 var2 = this.getParentNode(); var2 != null && var2 != this; var2 = var2.getParentNode()) {
         if (var2 == node) {
            return true;
         }
      }

      return false;
   }

   public final boolean isConnected() {
      l0 var1 = this.getParentNode();

      while (var1 != null && var1.getNodeType() != 9) {
         var1 = var1.getParentNode();
      }

      return var1 != null;
   }

   public l0 insertBefore(l0 newChild, l0 refChild) {
      if (this == newChild || this.ancestorNode(newChild)) {
         throw new ArgumentException(v3.n5("Cannot insert a node or any ancestor of that node as a child of itself."));
      }

      if (refChild == null) {
         return this.appendChild(newChild);
      }

      if (!this.isContainer()) {
         throw new InvalidOperationException(v3.n5("The current node cannot contain other nodes."));
      }

      if (refChild.getParentNode() != this) {
         throw new ArgumentException(v3.n5("The reference node is not a child of this node."));
      }

      if (newChild == refChild) {
         return newChild;
      }

      XmlDocument var3 = newChild.getOwnerDocument();
      XmlDocument var4 = this.getOwnerDocument();
      if (var3 != null && var3 != var4 && var3 != this) {
         throw new ArgumentException(v3.n5("The node to be inserted is from a different document context."));
      }

      if (!this.canInsertBefore(newChild, refChild)) {
         throw new InvalidOperationException(v3.n5("Cannot insert the node in the specified location."));
      }

      if (newChild.getParentNode() != null) {
         newChild.getParentNode().removeChild(newChild);
      }

      if (newChild.getNodeType() == 11) {
         l0 var10 = newChild.getFirstChild();
         if (var10 != null) {
            newChild.removeChild(var10);
            this.insertBefore(var10, refChild);
            this.insertAfter(newChild, var10);
         }

         return var10;
      } else if (com.aspose.slides.internal.v6g.k5.l6(newChild, e0.class) && this.isValidChildType(newChild.getNodeType())) {
         e0 var5 = (e0)newChild;
         e0 var6 = (e0)refChild;
         String var7 = newChild.getValue();
         p9 var8 = this.getEventArgs(newChild, newChild.getParentNode(), this, var7, var7, 0);
         if (var8 != null) {
            this.beforeEvent(var8);
         }

         if (var6 == this.getFirstChild()) {
            var5.l6 = var6;
            this.getLastNode().l6 = var5;
            var5.setParent(this);
            if (var5.isText() && var6.isText()) {
               nestTextNodes(var5, var6);
            }
         } else {
            e0 var9 = (e0)var6.getPreviousSibling();
            var5.l6 = var6;
            var9.l6 = var5;
            var5.setParent(this);
            if (var9.isText()) {
               if (var5.isText()) {
                  nestTextNodes(var9, var5);
                  if (var6.isText()) {
                     nestTextNodes(var5, var6);
                  }
               } else if (var6.isText()) {
                  unnestTextNodes(var9, var6);
               }
            } else if (var5.isText() && var6.isText()) {
               nestTextNodes(var5, var6);
            }
         }

         if (var8 != null) {
            this.afterEvent(var8);
         }

         return var5;
      } else {
         throw new InvalidOperationException(
            v3.n5("The specified node cannot be inserted as the valid child of this node, because the specified node is the wrong type.")
         );
      }
   }

   public l0 insertAfter(l0 newChild, l0 refChild) {
      if (this == newChild || this.ancestorNode(newChild)) {
         throw new ArgumentException(v3.n5("Cannot insert a node or any ancestor of that node as a child of itself."));
      }

      if (refChild == null) {
         return this.prependChild(newChild);
      }

      if (!this.isContainer()) {
         throw new InvalidOperationException(v3.n5("The current node cannot contain other nodes."));
      }

      if (refChild.getParentNode() != this) {
         throw new ArgumentException(v3.n5("The reference node is not a child of this node."));
      }

      if (newChild == refChild) {
         return newChild;
      }

      XmlDocument var3 = newChild.getOwnerDocument();
      XmlDocument var4 = this.getOwnerDocument();
      if (var3 != null && var3 != var4 && var3 != this) {
         throw new ArgumentException(v3.n5("The node to be inserted is from a different document context."));
      }

      if (!this.canInsertAfter(newChild, refChild)) {
         throw new InvalidOperationException(v3.n5("Cannot insert the node in the specified location."));
      }

      if (newChild.getParentNode() != null) {
         newChild.getParentNode().removeChild(newChild);
      }

      if (newChild.getNodeType() == 11) {
         l0 var10 = refChild;
         l0 var11 = newChild.getFirstChild();
         l0 var12 = var11;

         while (var12 != null) {
            l0 var13 = var12.getNextSibling();
            newChild.removeChild(var12);
            this.insertAfter(var12, var10);
            var10 = var12;
            var12 = var13;
         }

         return var11;
      } else if (com.aspose.slides.internal.v6g.k5.l6(newChild, e0.class) && this.isValidChildType(newChild.getNodeType())) {
         e0 var5 = (e0)newChild;
         e0 var6 = (e0)refChild;
         String var7 = newChild.getValue();
         p9 var8 = this.getEventArgs(newChild, newChild.getParentNode(), this, var7, var7, 0);
         if (var8 != null) {
            this.beforeEvent(var8);
         }

         if (var6 == this.getLastNode()) {
            var5.l6 = var6.l6;
            var6.l6 = var5;
            this.setLastNode(var5);
            var5.setParent(this);
            if (var6.isText() && var5.isText()) {
               nestTextNodes(var6, var5);
            }
         } else {
            e0 var9 = var6.l6;
            var5.l6 = var9;
            var6.l6 = var5;
            var5.setParent(this);
            if (var6.isText()) {
               if (var5.isText()) {
                  nestTextNodes(var6, var5);
                  if (var9.isText()) {
                     nestTextNodes(var5, var9);
                  }
               } else if (var9.isText()) {
                  unnestTextNodes(var6, var9);
               }
            } else if (var5.isText() && var9.isText()) {
               nestTextNodes(var5, var9);
            }
         }

         if (var8 != null) {
            this.afterEvent(var8);
         }

         return var5;
      } else {
         throw new InvalidOperationException(
            v3.n5("The specified node cannot be inserted as the valid child of this node, because the specified node is the wrong type.")
         );
      }
   }

   public l0 replaceChild(l0 newChild, l0 oldChild) {
      l0 var3 = oldChild.getNextSibling();
      this.removeChild(oldChild);
      l0 var4 = this.insertBefore(newChild, var3);
      return oldChild;
   }

   public l0 removeChild(l0 oldChild) {
      if (!this.isContainer()) {
         throw new InvalidOperationException(v3.n5("The current node cannot contain other nodes, so the node to be removed is not its child."));
      }

      if (oldChild.getParentNode() != this) {
         throw new ArgumentException(v3.n5("The node to be removed is not a child of this node."));
      }

      e0 var2 = (e0)oldChild;
      String var3 = var2.getValue();
      p9 var4 = this.getEventArgs(var2, this, null, var3, var3, 1);
      if (var4 != null) {
         this.beforeEvent(var4);
      }

      e0 var5 = this.getLastNode();
      if (var2 == this.getFirstChild()) {
         if (var2 == var5) {
            this.setLastNode(null);
            var2.l6 = null;
            var2.setParent(null);
         } else {
            e0 var6 = var2.l6;
            if (var6.isText() && var2.isText()) {
               unnestTextNodes(var2, var6);
            }

            var5.l6 = var6;
            var2.l6 = null;
            var2.setParent(null);
         }
      } else if (var2 == var5) {
         e0 var8 = (e0)var2.getPreviousSibling();
         var8.l6 = var2.l6;
         this.setLastNode(var8);
         var2.l6 = null;
         var2.setParent(null);
      } else {
         e0 var9 = (e0)var2.getPreviousSibling();
         e0 var7 = var2.l6;
         if (var7.isText()) {
            if (var9.isText()) {
               nestTextNodes(var9, var7);
            } else if (var2.isText()) {
               unnestTextNodes(var2, var7);
            }
         }

         var9.l6 = var7;
         var2.l6 = null;
         var2.setParent(null);
      }

      if (var4 != null) {
         this.afterEvent(var4);
      }

      return oldChild;
   }

   public l0 prependChild(l0 newChild) {
      return this.insertBefore(newChild, this.getFirstChild());
   }

   public l0 appendChild(l0 newChild) {
      XmlDocument var2 = this.getOwnerDocument();
      if (var2 == null) {
         var2 = com.aspose.slides.internal.v6g.k5.n5(this, XmlDocument.class);
      }

      if (!this.isContainer()) {
         throw new InvalidOperationException(v3.n5("The current node cannot contain other nodes."));
      }

      if (this != newChild && !this.ancestorNode(newChild)) {
         if (newChild.getParentNode() != null) {
            newChild.getParentNode().removeChild(newChild);
         }

         XmlDocument var3 = newChild.getOwnerDocument();
         if (var3 != null && var3 != var2 && var3 != this) {
            throw new ArgumentException(v3.n5("The node to be inserted is from a different document context."));
         }

         if (newChild.getNodeType() == 11) {
            l0 var8 = newChild.getFirstChild();
            l0 var9 = var8;

            while (var9 != null) {
               l0 var10 = var9.getNextSibling();
               newChild.removeChild(var9);
               this.appendChild(var9);
               var9 = var10;
            }

            return var8;
         } else {
            if (!com.aspose.slides.internal.v6g.k5.l6(newChild, e0.class) || !this.isValidChildType(newChild.getNodeType())) {
               throw new InvalidOperationException(
                  v3.n5("The specified node cannot be inserted as the valid child of this node, because the specified node is the wrong type.")
               );
            }

            if (!this.canInsertAfter(newChild, this.getLastChild())) {
               throw new InvalidOperationException(v3.n5("Cannot insert the node in the specified location."));
            }

            String var4 = newChild.getValue();
            p9 var5 = this.getEventArgs(newChild, newChild.getParentNode(), this, var4, var4, 0);
            if (var5 != null) {
               this.beforeEvent(var5);
            }

            e0 var6 = this.getLastNode();
            e0 var7 = (e0)newChild;
            if (var6 == null) {
               var7.l6 = var7;
               this.setLastNode(var7);
               var7.setParent(this);
            } else {
               var7.l6 = var6.l6;
               var6.l6 = var7;
               this.setLastNode(var7);
               var7.setParent(this);
               if (var6.isText() && var7.isText()) {
                  nestTextNodes(var6, var7);
               }
            }

            if (var5 != null) {
               this.afterEvent(var5);
            }

            return var7;
         }
      } else {
         throw new ArgumentException(v3.n5("Cannot insert a node or any ancestor of that node as a child of itself."));
      }
   }

   public l0 appendChildForLoad(l0 newChild, XmlDocument doc) {
      p9 var3 = doc.getInsertEventArgsForLoad(newChild, this);
      if (var3 != null) {
         doc.beforeEvent(var3);
      }

      e0 var4 = this.getLastNode();
      e0 var5 = (e0)newChild;
      if (var4 == null) {
         var5.l6 = var5;
         this.setLastNode(var5);
         var5.setParentForLoad(this);
      } else {
         var5.l6 = var4.l6;
         var4.l6 = var5;
         this.setLastNode(var5);
         if (var4.isText() && var5.isText()) {
            nestTextNodes(var4, var5);
         } else {
            var5.setParentForLoad(this);
         }
      }

      if (var3 != null) {
         doc.afterEvent(var3);
      }

      return var5;
   }

   public boolean isValidChildType(int type) {
      return false;
   }

   public boolean canInsertBefore(l0 newChild, l0 refChild) {
      return true;
   }

   public boolean canInsertAfter(l0 newChild, l0 refChild) {
      return true;
   }

   public boolean hasChildNodes() {
      return this.getLastNode() != null;
   }

   public abstract l0 cloneNode(boolean var1);

   public void copyChildren(XmlDocument doc, l0 container, boolean deep) {
      for (l0 var4 = container.getFirstChild(); var4 != null; var4 = var4.getNextSibling()) {
         this.appendChildForLoad(var4.cloneNode(deep), doc);
      }
   }

   public void normalize() {
      l0 var1 = null;
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      l0 var3 = this.getFirstChild();

      while (var3 != null) {
         l0 var4 = var3.getNextSibling();
         switch (var3.getNodeType()) {
            case 1:
               var3.normalize();
               if (var1 != null) {
                  var1.setValue(var2.toString());
                  var1 = null;
               }

               var2.l6(0, var2.l6());
               break;
            case 3:
            case 13:
            case 14:
               var2.n5(var3.getValue());
               l0 var5 = this.n5(var1, var3);
               if (var5 == var1) {
                  this.removeChild(var3);
               } else {
                  if (var1 != null) {
                     this.removeChild(var1);
                  }

                  var1 = var3;
               }
               break;
            default:
               if (var1 != null) {
                  var1.setValue(var2.toString());
                  var1 = null;
               }

               var2.l6(0, var2.l6());
         }

         var3 = var4;
      }

      if (var1 != null && var2.l6() > 0) {
         var1.setValue(var2.toString());
      }
   }

   private l0 n5(l0 var1, l0 var2) {
      if (var1 == null) {
         return var2;
      } else if (var1.getNodeType() == 3) {
         return var1;
      } else if (var2.getNodeType() == 3) {
         return var2;
      } else if (var1.getNodeType() == 14) {
         return var1;
      } else if (var2.getNodeType() == 14) {
         return var2;
      } else if (var1.getNodeType() == 13) {
         return var1;
      } else {
         return var2.getNodeType() == 13 ? var2 : null;
      }
   }

   public boolean supports(String feature, String version) {
      return com.aspose.slides.ms.System.d1.a6("XML", feature, (short)5) == 0 && (version == null || "1.0".equals(version) || "2.0".equals(version));
   }

   public String getNamespaceURI() {
      return com.aspose.slides.ms.System.d1.n5;
   }

   public String getPrefix() {
      return com.aspose.slides.ms.System.d1.n5;
   }

   public void setPrefix(String value) {
   }

   public abstract String getLocalName();

   public boolean isReadOnly() {
      XmlDocument var1 = this.getOwnerDocument();
      return hasReadOnlyParent(this);
   }

   public static boolean hasReadOnlyParent(l0 n) {
      while (n != null) {
         switch (n.getNodeType()) {
            case 2:
               n = ((u8)n).u9();
               break;
            case 3:
            case 4:
            default:
               n = n.getParentNode();
               break;
            case 5:
            case 6:
               return true;
         }
      }

      return false;
   }

   public l0 deepClone() {
      return this.cloneNode(true);
   }

   public final IEnumerator iterator_Rename_Namesake() {
      return new p7(this);
   }

   @Override
   public final IEnumerator iterator() {
      return new p7(this);
   }

   private void n5(com.aspose.slides.internal.l7h.a5 var1) {
      for (l0 var2 = this.getFirstChild(); var2 != null; var2 = var2.getNextSibling()) {
         if (var2.getFirstChild() == null) {
            if (var2.getNodeType() == 3 || var2.getNodeType() == 4 || var2.getNodeType() == 13 || var2.getNodeType() == 14) {
               var1.n5(var2.getInnerText());
            }
         } else {
            var2.n5(var1);
         }
      }
   }

   public String getInnerText() {
      l0 var1 = this.getFirstChild();
      if (var1 == null) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      if (var1.getNextSibling() == null) {
         int var2 = var1.getNodeType();
         switch (var2) {
            case 3:
            case 4:
            case 13:
            case 14:
               return var1.getValue();
         }
      }

      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      this.n5(var3);
      return var3.toString();
   }

   public void setInnerText(String value) {
      l0 var2 = this.getFirstChild();
      if (var2 != null && var2.getNextSibling() == null && var2.getNodeType() == 3) {
         var2.setValue(value);
      } else {
         this.removeAll();
         this.appendChild(this.getOwnerDocument().createTextNode(value));
      }
   }

   public String getOuterXml() {
      com.aspose.slides.internal.z0k.r4 var1 = new com.aspose.slides.internal.z0k.r4(com.aspose.slides.internal.x7n.l6.k5());
      y9 var2 = new y9(var1);

      try {
         this.writeTo(var2);
      } finally {
         var2.a6();
      }

      return var1.toString();
   }

   public String getInnerXml() {
      com.aspose.slides.internal.z0k.r4 var1 = new com.aspose.slides.internal.z0k.r4(com.aspose.slides.internal.x7n.l6.k5());
      y9 var2 = new y9(var1);

      try {
         this.writeContentTo(var2);
      } finally {
         var2.a6();
      }

      return var1.toString();
   }

   public void setInnerXml(String value) {
      throw new InvalidOperationException(v3.n5("Cannot set the 'InnerXml' for the current node because it is either read-only or cannot have children."));
   }

   public com.aspose.slides.internal.b8c.u4 getSchemaInfo() {
      return XmlDocument.NotKnownSchemaInfo;
   }

   public String getBaseURI() {
      for (l0 var1 = this.getParentNode(); var1 != null; var1 = var1.getParentNode()) {
         int var2 = var1.getNodeType();
         if (var2 == 5) {
            return ((t6)var1).l6();
         }

         if (var2 == 9 || var2 == 6 || var2 == 2) {
            return var1.getBaseURI();
         }
      }

      return com.aspose.slides.ms.System.d1.n5;
   }

   public abstract void writeTo(l1 var1);

   public abstract void writeContentTo(l1 var1);

   public void removeAll() {
      l0 var1 = this.getFirstChild();
      Object var2 = null;

      while (var1 != null) {
         var2 = var1.getNextSibling();
         this.removeChild(var1);
         var1 = (l0)var2;
      }
   }

   public final XmlDocument getDocument() {
      return this.getNodeType() == 9 ? (XmlDocument)this : this.getOwnerDocument();
   }

   public String getNamespaceOfPrefix(String prefix) {
      String var2 = this.getNamespaceOfPrefixStrict(prefix);
      return var2 != null ? var2 : com.aspose.slides.ms.System.d1.n5;
   }

   public final String getNamespaceOfPrefixStrict(String prefix) {
      XmlDocument var2 = this.getDocument();
      if (var2 != null) {
         prefix = var2.getNameTable().l6(prefix);
         if (prefix == null) {
            return null;
         }

         l0 var3 = this;

         while (var3 != null) {
            if (var3.getNodeType() == 1) {
               m8 var4 = (m8)var3;
               if (var4.s7()) {
                  w5 var5 = var4.getAttributes();
                  if (prefix.length() == 0) {
                     for (int var9 = 0; var9 < var5.l6(); var9++) {
                        u8 var10 = var5.n5(var9);
                        if (var10.getPrefix().length() == 0 && v8.n5(var10.getLocalName(), var2.strXmlns)) {
                           return var10.getValue();
                        }
                     }
                  } else {
                     for (int var6 = 0; var6 < var5.l6(); var6++) {
                        u8 var7 = var5.n5(var6);
                        if (v8.n5(var7.getPrefix(), var2.strXmlns)) {
                           if (v8.n5(var7.getLocalName(), prefix)) {
                              return var7.getValue();
                           }
                        } else if (v8.n5(var7.getPrefix(), prefix)) {
                           return var7.getNamespaceURI();
                        }
                     }
                  }
               }

               if (v8.n5(var3.getPrefix(), prefix)) {
                  return var3.getNamespaceURI();
               }

               var3 = var3.getParentNode();
            } else if (var3.getNodeType() == 2) {
               var3 = ((u8)var3).u9();
            } else {
               var3 = var3.getParentNode();
            }
         }

         if (v8.n5(var2.strXml, prefix)) {
            return var2.strReservedXml;
         }

         if (v8.n5(var2.strXmlns, prefix)) {
            return var2.strReservedXmlns;
         }
      }

      return null;
   }

   public String getPrefixOfNamespace(String namespaceURI) {
      String var2 = this.getPrefixOfNamespaceStrict(namespaceURI);
      return var2 != null ? var2 : com.aspose.slides.ms.System.d1.n5;
   }

   public final String getPrefixOfNamespaceStrict(String namespaceURI) {
      XmlDocument var2 = this.getDocument();
      if (var2 != null) {
         namespaceURI = var2.getNameTable().n5(namespaceURI);
         l0 var3 = this;

         while (var3 != null) {
            if (var3.getNodeType() == 1) {
               m8 var4 = (m8)var3;
               if (var4.s7()) {
                  w5 var5 = var4.getAttributes();

                  for (int var6 = 0; var6 < var5.l6(); var6++) {
                     u8 var7 = var5.n5(var6);
                     if (var7.getPrefix().length() == 0) {
                        if (v8.n5(var7.getLocalName(), var2.strXmlns) && com.aspose.slides.ms.System.d1.a6(var7.getValue(), namespaceURI)) {
                           return com.aspose.slides.ms.System.d1.n5;
                        }
                     } else if (v8.n5(var7.getPrefix(), var2.strXmlns)) {
                        if (com.aspose.slides.ms.System.d1.a6(var7.getValue(), namespaceURI)) {
                           return var7.getLocalName();
                        }
                     } else if (v8.n5(var7.getNamespaceURI(), namespaceURI)) {
                        return var7.getPrefix();
                     }
                  }
               }

               if (v8.n5(var3.getNamespaceURI(), namespaceURI)) {
                  return var3.getPrefix();
               }

               var3 = var3.getParentNode();
            } else if (var3.getNodeType() == 2) {
               var3 = ((u8)var3).u9();
            } else {
               var3 = var3.getParentNode();
            }
         }

         if (v8.n5(var2.strReservedXml, namespaceURI)) {
            return var2.strXml;
         }

         if (v8.n5(var2.strReservedXmlns, namespaceURI)) {
            return var2.strXmlns;
         }
      }

      return null;
   }

   public m8 get_Item(String name) {
      for (l0 var2 = this.getFirstChild(); var2 != null; var2 = var2.getNextSibling()) {
         if (var2.getNodeType() == 1 && com.aspose.slides.ms.System.d1.a6(var2.getName(), name)) {
            return (m8)var2;
         }
      }

      return null;
   }

   public m8 get_Item(String localname, String ns) {
      for (l0 var3 = this.getFirstChild(); var3 != null; var3 = var3.getNextSibling()) {
         if (var3.getNodeType() == 1
            && com.aspose.slides.ms.System.d1.a6(var3.getLocalName(), localname)
            && com.aspose.slides.ms.System.d1.a6(var3.getNamespaceURI(), ns)) {
            return (m8)var3;
         }
      }

      return null;
   }

   public void setParent(l0 node) {
      if (node == null) {
         this.parentNode = this.getOwnerDocument();
      } else {
         this.parentNode = node;
      }
   }

   public void setParentForLoad(l0 node) {
      this.parentNode = node;
   }

   public static void splitName(String name, String[] prefix, String[] localName) {
      int var3 = com.aspose.slides.ms.System.d1.u3(name, ':');
      if (-1 != var3 && 0 != var3 && name.length() - 1 != var3) {
         prefix[0] = com.aspose.slides.ms.System.d1.l6(name, 0, var3);
         localName[0] = com.aspose.slides.ms.System.d1.k5(name, var3 + 1);
      } else {
         prefix[0] = com.aspose.slides.ms.System.d1.n5;
         localName[0] = name;
      }
   }

   public l0 findChild(int type) {
      for (l0 var2 = this.getFirstChild(); var2 != null; var2 = var2.getNextSibling()) {
         if (var2.getNodeType() == type) {
            return var2;
         }
      }

      return null;
   }

   public p9 getEventArgs(l0 node, l0 oldParent, l0 newParent, String oldValue, String newValue, int action) {
      XmlDocument var7 = this.getOwnerDocument();
      if (var7 == null) {
         return null;
      } else if (var7.isLoading() || (newParent == null || !newParent.isReadOnly()) && (oldParent == null || !oldParent.isReadOnly())) {
         return var7.getEventArgs(node, oldParent, newParent, oldValue, newValue, action);
      } else {
         throw new InvalidOperationException(v3.n5("This node is read-only. It cannot be modified."));
      }
   }

   public void beforeEvent(p9 args) {
      if (args != null) {
         this.getOwnerDocument().beforeEvent(args);
      }
   }

   public void afterEvent(p9 args) {
      if (args != null) {
         this.getOwnerDocument().afterEvent(args);
      }
   }

   public int getXmlSpace() {
      l0 var1 = this;
      m8 var2 = null;

      do {
         var2 = com.aspose.slides.internal.v6g.k5.n5(var1, m8.class);
         if (var2 != null && var2.u3("xml:space")) {
            switch (n5.n5(f4.j5(var2.n5("xml:space")))) {
               case 0:
                  return 1;
               case 1:
                  return 2;
            }
         }

         var1 = var1.getParentNode();
      } while (var1 != null);

      return 0;
   }

   public String getXmlLang() {
      l0 var1 = this;
      m8 var2 = null;

      do {
         var2 = com.aspose.slides.internal.v6g.k5.n5(var1, m8.class);
         if (var2 != null && var2.u3("xml:lang")) {
            return var2.n5("xml:lang");
         }

         var1 = var1.getParentNode();
      } while (var1 != null);

      return com.aspose.slides.ms.System.d1.n5;
   }

   public int getXPNodeType() {
      return -1;
   }

   public String getXPLocalName() {
      return com.aspose.slides.ms.System.d1.n5;
   }

   public String getXPAttribute(String localName, String namespaceURI) {
      return com.aspose.slides.ms.System.d1.n5;
   }

   public boolean isText() {
      return false;
   }

   public l0 getPreviousText() {
      return null;
   }

   public static void nestTextNodes(l0 prevNode, l0 nextNode) {
      nextNode.parentNode = prevNode;
   }

   public static void unnestTextNodes(l0 prevNode, l0 nextNode) {
      nextNode.parentNode = prevNode.getParentNode();
   }
}
