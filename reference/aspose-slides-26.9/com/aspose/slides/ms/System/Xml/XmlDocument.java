package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.b8c.j2;
import com.aspose.slides.internal.b8c.k0t;
import com.aspose.slides.ms.System.IDisposable;

public class XmlDocument extends l0 {
   private o2 n5;
   private c4 l6;
   private e0 k5;
   private f8 u3;
   private Hashtable a6;
   private Hashtable u9;
   private com.aspose.slides.internal.b8c.x0 h0;
   private k0t c8;
   private boolean t2;
   private boolean s7;
   public boolean fEntRefNodesPresent;
   public boolean fCDataNodesPresent;
   private boolean x8;
   private boolean n3;
   public String strDocumentName;
   public String strDocumentFragmentName;
   public String strCommentName;
   public String strTextName;
   public String strCDataSectionName;
   public String strEntityName;
   public String strID;
   public String strXmlns;
   public String strXml;
   public String strSpace;
   public String strLang;
   public String strEmpty;
   public String strNonSignificantWhitespaceName;
   public String strSignificantWhitespaceName;
   public String strReservedXmlns;
   public String strReservedXml;
   public String baseURI;
   private o8 y4;
   public boolean bSetResolver;
   public Object objLock;
   private u8 e2;
   public static y1 EmptyEnumerator = new y1();
   public static com.aspose.slides.internal.b8c.u4 NotKnownSchemaInfo = new j2(0);
   public static com.aspose.slides.internal.b8c.u4 ValidSchemaInfo = new j2(1);
   public static com.aspose.slides.internal.b8c.u4 InvalidSchemaInfo = new j2(2);
   public g8 NodeInsertingDelegate;
   public final com.aspose.slides.internal.v6g.n5<g8> NodeInserting = new w3(this);
   public g8 NodeInsertedDelegate;
   public final com.aspose.slides.internal.v6g.n5<g8> NodeInserted = new q3(this);
   public g8 NodeRemovingDelegate;
   public final com.aspose.slides.internal.v6g.n5<g8> NodeRemoving = new p4(this);
   public g8 NodeRemovedDelegate;
   public final com.aspose.slides.internal.v6g.n5<g8> NodeRemoved = new y6(this);
   public g8 NodeChangingDelegate;
   public final com.aspose.slides.internal.v6g.n5<g8> NodeChanging = new l5(this);
   public g8 NodeChangedDelegate;
   public final com.aspose.slides.internal.v6g.n5<g8> NodeChanged = new d9(this);

   public XmlDocument() {
      this(new o2());
   }

   public XmlDocument(z9 nt) {
      this(new o2(nt));
   }

   public XmlDocument(o2 imp) {
      this.n5 = imp;
      this.l6 = new c4(this);
      z9 var2 = this.getNameTable();
      var2.n5(com.aspose.slides.ms.System.d1.n5);
      this.strDocumentName = var2.n5("#document");
      this.strDocumentFragmentName = var2.n5("#document-fragment");
      this.strCommentName = var2.n5("#comment");
      this.strTextName = var2.n5("#text");
      this.strCDataSectionName = var2.n5("#cdata-section");
      this.strEntityName = var2.n5("#entity");
      this.strID = var2.n5("id");
      this.strNonSignificantWhitespaceName = var2.n5("#whitespace");
      this.strSignificantWhitespaceName = var2.n5("#significant-whitespace");
      this.strXmlns = var2.n5("xmlns");
      this.strXml = var2.n5("xml");
      this.strSpace = var2.n5("space");
      this.strLang = var2.n5("lang");
      this.strReservedXmlns = var2.n5("http://www.w3.org/2000/xmlns/");
      this.strReservedXml = var2.n5("http://www.w3.org/XML/1998/namespace");
      this.strEmpty = var2.n5(com.aspose.slides.ms.System.d1.n5);
      this.baseURI = com.aspose.slides.ms.System.d1.n5;
      this.objLock = new Object();
   }

   public final com.aspose.slides.internal.b8c.x0 getDtdSchemaInfo() {
      return this.h0;
   }

   public final void setDtdSchemaInfo(com.aspose.slides.internal.b8c.x0 value) {
      this.h0 = value;
   }

   public static void checkName(String name) {
      int var1 = y5.n5(name, 0);
      if (var1 < name.length()) {
         throw new XmlException("The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(name, var1));
      }
   }

   public final x7 addXmlName(String prefix, String localName, String namespaceURI, com.aspose.slides.internal.b8c.u4 schemaInfo) {
      return this.l6.l6(prefix, localName, namespaceURI, schemaInfo);
   }

   public final x7 getXmlName(String prefix, String localName, String namespaceURI, com.aspose.slides.internal.b8c.u4 schemaInfo) {
      return this.l6.n5(prefix, localName, namespaceURI, schemaInfo);
   }

   public final x7 addAttrXmlName(String prefix, String localName, String namespaceURI, com.aspose.slides.internal.b8c.u4 schemaInfo) {
      x7 var5 = this.addXmlName(prefix, localName, namespaceURI, schemaInfo);
      if (!this.isLoading()) {
         String var6 = var5.s7();
         String var7 = var5.t2();
         String var8 = var5.c8();
         if ((var6 == this.strXmlns || var6 == this.strEmpty && var8 == this.strXmlns) ^ var7 == this.strReservedXmlns) {
            throw new ArgumentException(v3.n5("The namespace declaration attribute has an incorrect 'namespaceURI': '{0}'.", namespaceURI));
         }
      }

      return var5;
   }

   public final boolean addIdInfo(x7 eleName, x7 attrName) {
      if (this.u9 != null && this.u9.get_Item(eleName) != null) {
         return false;
      }

      if (this.u9 == null) {
         this.u9 = new Hashtable();
      }

      this.u9.addItem(eleName, attrName);
      return true;
   }

   private x7 n5(x7 var1) {
      x7 var2 = this.getXmlName(var1.s7(), var1.c8(), com.aspose.slides.ms.System.d1.n5, null);
      return var2 != null ? (x7)this.u9.get_Item(var2) : null;
   }

   public final x7 getIDInfoByElement(x7 eleName) {
      return this.u9 == null ? null : this.n5(eleName);
   }

   private com.aspose.slides.ms.System.u8 n5(ArrayList var1, m8 var2) {
      ArrayList var3 = new ArrayList();
      IEnumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.ms.System.u8 var5 = (com.aspose.slides.ms.System.u8)var4.next();
            if (!var5.l6()) {
               var3.addItem(var5);
            } else if ((m8)var5.n5() == var2) {
               return var5;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            ((IDisposable)var4).dispose();
         }
      }

      IEnumerator var15 = var3.iterator();

      try {
         while (var15.hasNext()) {
            com.aspose.slides.ms.System.u8 var6 = (com.aspose.slides.ms.System.u8)var15.next();
            var1.removeItem(var6);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
            ((IDisposable)var15).dispose();
         }
      }

      return null;
   }

   public final void addElementWithId(String id, m8 elem) {
      if (this.a6 != null && this.a6.contains(id)) {
         ArrayList var4 = (ArrayList)this.a6.get_Item(id);
         if (this.n5(var4, elem) == null) {
            var4.addItem(new com.aspose.slides.ms.System.u8(elem));
         }
      } else {
         if (this.a6 == null) {
            this.a6 = new Hashtable();
         }

         ArrayList var3 = new ArrayList();
         var3.addItem(new com.aspose.slides.ms.System.u8(elem));
         this.a6.addItem(id, var3);
      }
   }

   public final void removeElementWithId(String id, m8 elem) {
      if (this.a6 != null && this.a6.contains(id)) {
         ArrayList var3 = (ArrayList)this.a6.get_Item(id);
         com.aspose.slides.ms.System.u8 var4 = this.n5(var3, elem);
         if (var4 != null) {
            var3.removeItem(var4);
            if (var3.size() == 0) {
               this.a6.removeItem(id);
            }
         }
      }
   }

   @Override
   public l0 cloneNode(boolean deep) {
      XmlDocument var2 = this.getImplementation().n5();
      var2.setBaseURI(this.baseURI);
      if (deep) {
         var2.n5(this, var2, deep);
      }

      return var2;
   }

   @Override
   public int getNodeType() {
      return 9;
   }

   @Override
   public l0 getParentNode() {
      return null;
   }

   public j6 getDocumentType() {
      return (j6)this.findChild(10);
   }

   public a1 getDeclaration() {
      return this.hasChildNodes() ? com.aspose.slides.internal.v6g.k5.n5(this.getFirstChild(), a1.class) : null;
   }

   public final o2 getImplementation() {
      return this.n5;
   }

   @Override
   public String getName() {
      return this.strDocumentName;
   }

   @Override
   public String getLocalName() {
      return this.strDocumentName;
   }

   public m8 getDocumentElement() {
      return (m8)this.findChild(1);
   }

   @Override
   public boolean isContainer() {
      return true;
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
   public XmlDocument getOwnerDocument() {
      return null;
   }

   public final k0t getSchemas() {
      if (this.c8 == null) {
         this.c8 = new k0t(this.getNameTable());
      }

      return this.c8;
   }

   public final void setSchemas(k0t value) {
      this.c8 = value;
   }

   public final boolean canReportValidity() {
      return this.t2;
   }

   public final boolean hasSetResolver() {
      return this.bSetResolver;
   }

   public final o8 getResolver() {
      return this.y4;
   }

   public void setXmlResolver(o8 value) {
      this.y4 = value;
      if (!this.bSetResolver) {
         this.bSetResolver = true;
      }

      j6 var2 = this.getDocumentType();
      if (var2 != null) {
         var2.n5(null);
      }
   }

   @Override
   public boolean isValidChildType(int type) {
      switch (type) {
         case 1:
            if (this.getDocumentElement() != null) {
               throw new InvalidOperationException(v3.n5("This document already has a 'DocumentElement' node."));
            }

            return true;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 9:
         case 11:
         case 12:
         case 15:
         case 16:
         default:
            return false;
         case 7:
         case 8:
         case 13:
         case 14:
            return true;
         case 10:
            if (this.getDocumentType() != null) {
               throw new InvalidOperationException(v3.n5("This document already has a 'DocumentType' node."));
            }

            return true;
         case 17:
            if (this.getDeclaration() != null) {
               throw new InvalidOperationException(v3.n5("This document already has an 'XmlDeclaration' node."));
            } else {
               return true;
            }
      }
   }

   private boolean n5(int var1, l0 var2) {
      if (var2 == null) {
         return false;
      }

      l0 var3 = null;
      if (var2.getParentNode() != null) {
         var3 = var2.getParentNode().getFirstChild();
      }

      while (var3 != null) {
         if (var3.getNodeType() == var1) {
            return true;
         }

         if (var3 == var2) {
            break;
         }

         var3 = var3.getNextSibling();
      }

      return false;
   }

   private boolean l6(int var1, l0 var2) {
      for (l0 var3 = var2; var3 != null; var3 = var3.getNextSibling()) {
         if (var3.getNodeType() == var1) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean canInsertBefore(l0 newChild, l0 refChild) {
      if (refChild == null) {
         refChild = this.getFirstChild();
      }

      if (refChild == null) {
         return true;
      }

      switch (newChild.getNodeType()) {
         case 1:
            if (refChild.getNodeType() != 17) {
               return !this.l6(10, refChild);
            }
            break;
         case 7:
         case 8:
            return refChild.getNodeType() != 17;
         case 10:
            if (refChild.getNodeType() != 17) {
               return !this.n5(1, refChild.getPreviousSibling());
            }
            break;
         case 17:
            return refChild == this.getFirstChild();
      }

      return false;
   }

   @Override
   public boolean canInsertAfter(l0 newChild, l0 refChild) {
      if (refChild == null) {
         refChild = this.getLastChild();
      }

      if (refChild == null) {
         return true;
      }

      switch (newChild.getNodeType()) {
         case 1:
            return !this.l6(10, refChild.getNextSibling());
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 9:
         case 11:
         case 12:
         default:
            return false;
         case 7:
         case 8:
         case 13:
         case 14:
            return true;
         case 10:
            return !this.n5(1, refChild);
      }
   }

   public final u8 createAttribute(String name) {
      String var2 = com.aspose.slides.ms.System.d1.n5;
      String var3 = com.aspose.slides.ms.System.d1.n5;
      String var4 = com.aspose.slides.ms.System.d1.n5;
      String[] var5 = new String[]{var2};
      String[] var6 = new String[]{var3};
      splitName(name, var5, var6);
      var2 = var5[0];
      var3 = var6[0];
      String[] var7 = new String[]{var4};
      this.setDefaultNamespace(var2, var3, var7);
      var4 = var7[0];
      return this.createAttribute(var2, var3, var4);
   }

   public final void setDefaultNamespace(String prefix, String localName, String[] namespaceURI) {
      if (!com.aspose.slides.ms.System.d1.a6(prefix, this.strXmlns) && (prefix.length() != 0 || !com.aspose.slides.ms.System.d1.a6(localName, this.strXmlns))) {
         if (com.aspose.slides.ms.System.d1.a6(prefix, this.strXml)) {
            namespaceURI[0] = this.strReservedXml;
         }
      } else {
         namespaceURI[0] = this.strReservedXmlns;
      }
   }

   public u5 createCDataSection(String data) {
      this.fCDataNodesPresent = true;
      return new u5(data, this);
   }

   public h5 createComment(String data) {
      return new h5(data, this);
   }

   public j6 createDocumentType(String name, String publicId, String systemId, String internalSubset) {
      return new j6(name, publicId, systemId, internalSubset, this);
   }

   public t5 createDocumentFragment() {
      return new t5(this);
   }

   public final m8 createElement(String name) {
      String var2 = com.aspose.slides.ms.System.d1.n5;
      String var3 = com.aspose.slides.ms.System.d1.n5;
      String[] var4 = new String[]{var2};
      String[] var5 = new String[]{var3};
      splitName(name, var4, var5);
      var2 = var4[0];
      var3 = var5[0];
      return this.createElement(var2, var3, com.aspose.slides.ms.System.d1.n5);
   }

   public final void addDefaultAttributes(m8 elem) {
      com.aspose.slides.internal.b8c.x0 var2 = this.getDtdSchemaInfo();
      com.aspose.slides.internal.b8c.t6 var3 = this.n5(elem);
      if (var3 != null && var3.k7() != null) {
         Dictionary$Enumerator var4 = var3.k7().iterator();

         while (var4.hasNext()) {
            com.aspose.slides.internal.b8c.h9 var5 = (com.aspose.slides.internal.b8c.h9)var4.getValue();
            if (var5.r4() == 0 || var5.r4() == 3) {
               String var6 = com.aspose.slides.ms.System.d1.n5;
               String var7 = var5.z8().l6();
               String var8 = com.aspose.slides.ms.System.d1.n5;
               if (var2.x8() == 1) {
                  var6 = var5.z8().n5();
               } else {
                  var6 = var5.j5();
                  var8 = var5.z8().n5();
               }

               u8 var9 = this.n5(var5, var6, var7, var8);
               elem.n5(var9);
            }
         }
      }
   }

   private com.aspose.slides.internal.b8c.t6 n5(m8 var1) {
      com.aspose.slides.internal.b8c.x0 var2 = this.getDtdSchemaInfo();
      if (var2 != null) {
         k6 var3 = new k6(var1.getLocalName(), var2.x8() == 1 ? var1.getPrefix() : var1.getNamespaceURI());
         com.aspose.slides.internal.b8c.t6 var4 = null;
         com.aspose.slides.internal.b8c.t6[] var5 = new com.aspose.slides.internal.b8c.t6[]{var4};
         boolean var6 = var2.h0().tryGetValue(var3, var5);
         var4 = var5[0];
         if (var6) {
            return var4;
         }
      }

      return null;
   }

   private u8 n5(com.aspose.slides.internal.b8c.h9 var1, String var2, String var3, String var4) {
      String[] var5 = new String[]{var4};
      this.setDefaultNamespace(var2, var3, var5);
      var4 = var5[0];
      u8 var6 = this.createDefaultAttribute(var2, var3, var4);
      var6.setInnerXml(var1.d5());
      o4 var7 = com.aspose.slides.internal.v6g.k5.n5(var6, o4.class);
      if (var7 != null) {
         var7.n5(false);
      }

      return var6;
   }

   public t6 createEntityReference(String name) {
      return new t6(name, this);
   }

   public j1 createProcessingInstruction(String target, String data) {
      return new j1(target, data, this);
   }

   public a1 createXmlDeclaration(String version, String encoding, String standalone) {
      return new a1(version, encoding, standalone, this);
   }

   public t0 createTextNode(String text) {
      return new t0(text, this);
   }

   public n8 createSignificantWhitespace(String text) {
      return new n8(text, this);
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 createNavigator() {
      return this.createNavigator(this);
   }

   public com.aspose.slides.internal.x6s.a6 createNavigator(l0 node) {
      int var2 = node.getNodeType();
      switch (var2) {
         case 3:
         case 4:
         case 14:
            l0 var5 = node.getParentNode();
            if (var5 != null) {
               do {
                  int var6 = var5.getNodeType();
                  if (var6 == 2) {
                     return null;
                  }

                  if (var6 != 5) {
                     break;
                  }

                  var5 = var5.getParentNode();
               } while (var5 != null);
            }

            node = this.n5(node);
            return new q0(this, node);
         case 5:
         case 6:
         case 10:
         case 12:
         case 17:
            return null;
         case 7:
         case 8:
         case 9:
         case 11:
         case 15:
         case 16:
         default:
            return new q0(this, node);
         case 13:
            l0 var3 = node.getParentNode();
            if (var3 != null) {
               do {
                  int var4 = var3.getNodeType();
                  if (var4 == 9 || var4 == 2) {
                     return null;
                  }

                  if (var4 != 5) {
                     break;
                  }

                  var3 = var3.getParentNode();
               } while (var3 != null);
            }

            node = this.n5(node);
            return new q0(this, node);
      }
   }

   public static boolean isTextNode(int nt) {
      switch (nt) {
         case 3:
         case 4:
         case 13:
         case 14:
            return true;
         default:
            return false;
      }
   }

   private l0 n5(l0 var1) {
      l0 var2 = null;

      while (isTextNode(var1.getNodeType())) {
         var2 = var1;
         var1 = var1.getPreviousSibling();
         if (var1 == null) {
            l0 var3 = var2;

            while (var3.getParentNode() != null && var3.getParentNode().getNodeType() == 5) {
               if (var3.getParentNode().getPreviousSibling() != null) {
                  var1 = var3.getParentNode().getPreviousSibling();
                  break;
               }

               var3 = var3.getParentNode();
               if (var3 == null) {
                  break;
               }
            }
         }

         if (var1 == null) {
            break;
         }

         while (var1.getNodeType() == 5) {
            var1 = var1.getLastChild();
         }
      }

      return var2;
   }

   public d3 createWhitespace(String text) {
      return new d3(text, this);
   }

   public i0 getElementsByTagName(String name) {
      return new b9(this, name);
   }

   public final u8 createAttribute(String qualifiedName, String namespaceURI) {
      String var3 = com.aspose.slides.ms.System.d1.n5;
      String var4 = com.aspose.slides.ms.System.d1.n5;
      String[] var5 = new String[]{var3};
      String[] var6 = new String[]{var4};
      splitName(qualifiedName, var5, var6);
      var3 = var5[0];
      var4 = var6[0];
      return this.createAttribute(var3, var4, namespaceURI);
   }

   public final m8 createElement(String qualifiedName, String namespaceURI) {
      String var3 = com.aspose.slides.ms.System.d1.n5;
      String var4 = com.aspose.slides.ms.System.d1.n5;
      String[] var5 = new String[]{var3};
      String[] var6 = new String[]{var4};
      splitName(qualifiedName, var5, var6);
      var3 = var5[0];
      var4 = var6[0];
      return this.createElement(var3, var4, namespaceURI);
   }

   public i0 getElementsByTagName(String localName, String namespaceURI) {
      return new b9(this, localName, namespaceURI);
   }

   public m8 getElementById(String elementId) {
      if (this.a6 != null) {
         ArrayList var2 = (ArrayList)this.a6.get_Item(elementId);
         if (var2 != null) {
            IEnumerator var3 = var2.iterator();

            try {
               while (var3.hasNext()) {
                  com.aspose.slides.ms.System.u8 var4 = (com.aspose.slides.ms.System.u8)var3.next();
                  m8 var5 = (m8)var4.n5();
                  if (var5 != null && var5.isConnected()) {
                     return var5;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  ((IDisposable)var3).dispose();
               }
            }
         }
      }

      return null;
   }

   public l0 importNode(l0 node, boolean deep) {
      return this.n5(node, deep);
   }

   private l0 n5(l0 var1, boolean var2) {
      l0 var3 = null;
      if (var1 == null) {
         throw new InvalidOperationException(v3.n5("Cannot import a null node."));
      }

      switch (var1.getNodeType()) {
         case 1:
            var3 = this.createElement(var1.getPrefix(), var1.getLocalName(), var1.getNamespaceURI());
            this.n5(var1, var3);
            if (var2) {
               this.n5(var1, var3, var2);
            }
            break;
         case 2:
            var3 = this.createAttribute(var1.getPrefix(), var1.getLocalName(), var1.getNamespaceURI());
            this.n5(var1, var3, true);
            break;
         case 3:
            var3 = this.createTextNode(var1.getValue());
            break;
         case 4:
            var3 = this.createCDataSection(var1.getValue());
            break;
         case 5:
            var3 = this.createEntityReference(var1.getName());
            break;
         case 6:
         case 9:
         case 12:
         case 15:
         case 16:
         default:
            throw new InvalidOperationException(
               com.aspose.slides.ms.System.d1.n5(
                  com.aspose.slides.internal.x7n.l6.k5(),
                  v3.n5("Cannot import nodes of type '{0}'."),
                  com.aspose.slides.ms.System.s3.n5(a4.class, var1.getNodeType())
               )
            );
         case 7:
            var3 = this.createProcessingInstruction(var1.getName(), var1.getValue());
            break;
         case 8:
            var3 = this.createComment(var1.getValue());
            break;
         case 10:
            j6 var5 = (j6)var1;
            var3 = this.createDocumentType(var5.getName(), var5.k5(), var5.u3(), var5.a6());
            break;
         case 11:
            var3 = this.createDocumentFragment();
            if (var2) {
               this.n5(var1, var3, var2);
            }
            break;
         case 13:
            var3 = this.createWhitespace(var1.getValue());
            break;
         case 14:
            var3 = this.createSignificantWhitespace(var1.getValue());
            break;
         case 17:
            a1 var4 = (a1)var1;
            var3 = this.createXmlDeclaration(var4.n5(), var4.l6(), var4.k5());
      }

      return var3;
   }

   private void n5(l0 var1, l0 var2) {
      int var3 = var1.getAttributes().l6();

      for (int var4 = 0; var4 < var3; var4++) {
         if (var1.getAttributes().n5(var4).a6()) {
            var2.getAttributes().n5(this.n5(var1.getAttributes().n5(var4), true));
         }
      }
   }

   private void n5(l0 var1, l0 var2, boolean var3) {
      for (l0 var4 = var1.getFirstChild(); var4 != null; var4 = var4.getNextSibling()) {
         var2.appendChild(this.n5(var4, var3));
      }
   }

   public final z9 getNameTable() {
      return this.n5.l6();
   }

   public u8 createAttribute(String prefix, String localName, String namespaceURI) {
      return new u8(this.addAttrXmlName(prefix, localName, namespaceURI, null), this);
   }

   public u8 createDefaultAttribute(String prefix, String localName, String namespaceURI) {
      return new o4(prefix, localName, namespaceURI, this);
   }

   public m8 createElement(String prefix, String localName, String namespaceURI) {
      m8 var4 = new m8(this.addXmlName(prefix, localName, namespaceURI, null), true, this);
      if (!this.isLoading()) {
         this.addDefaultAttributes(var4);
      }

      return var4;
   }

   public final boolean getPreserveWhitespace() {
      return this.x8;
   }

   public final void setPreserveWhitespace(boolean value) {
      this.x8 = value;
   }

   @Override
   public boolean isReadOnly() {
      return false;
   }

   public final f8 getEntities() {
      if (this.u3 == null) {
         this.u3 = new f8(this);
      }

      return this.u3;
   }

   public final void setEntities(f8 value) {
      this.u3 = value;
   }

   public final boolean isLoading() {
      return this.n3;
   }

   public final void setLoading(boolean value) {
      this.n3 = value;
   }

   public final boolean getActualLoadingStatus() {
      return this.s7;
   }

   public final void setActualLoadingStatus(boolean value) {
      this.s7 = value;
   }

   public l0 createNode(int type, String prefix, String name, String namespaceURI) {
      switch (type) {
         case 1:
            if (prefix != null) {
               return this.createElement(prefix, name, namespaceURI);
            }

            return this.createElement(name, namespaceURI);
         case 2:
            if (prefix != null) {
               return this.createAttribute(prefix, name, namespaceURI);
            }

            return this.createAttribute(name, namespaceURI);
         case 3:
            return this.createTextNode(com.aspose.slides.ms.System.d1.n5);
         case 4:
            return this.createCDataSection(com.aspose.slides.ms.System.d1.n5);
         case 5:
            return this.createEntityReference(name);
         case 6:
         case 12:
         case 15:
         case 16:
         default:
            throw new ArgumentException(v3.n5("Cannot create node of type {0}.", type));
         case 7:
            return this.createProcessingInstruction(name, com.aspose.slides.ms.System.d1.n5);
         case 8:
            return this.createComment(com.aspose.slides.ms.System.d1.n5);
         case 9:
            return new XmlDocument();
         case 10:
            return this.createDocumentType(name, com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5);
         case 11:
            return this.createDocumentFragment();
         case 13:
            return this.createWhitespace(com.aspose.slides.ms.System.d1.n5);
         case 14:
            return this.createSignificantWhitespace(com.aspose.slides.ms.System.d1.n5);
         case 17:
            return this.createXmlDeclaration("1.0", null, null);
      }
   }

   public l0 createNode(String nodeTypeString, String name, String namespaceURI) {
      return this.createNode(this.convertToNodeType(nodeTypeString), name, namespaceURI);
   }

   public l0 createNode(int type, String name, String namespaceURI) {
      return this.createNode(type, null, name, namespaceURI);
   }

   public l0 readNode(c7 reader) {
      l0 var2 = null;

      try {
         this.setLoading(true);
         i2 var3 = new i2();
         var2 = var3.n5(this, reader);
      } finally {
         this.setLoading(false);
      }

      return var2;
   }

   public final int convertToNodeType(String nodeTypeString) {
      if ("element".equals(nodeTypeString)) {
         return 1;
      } else if ("attribute".equals(nodeTypeString)) {
         return 2;
      } else if ("text".equals(nodeTypeString)) {
         return 3;
      } else if ("cdatasection".equals(nodeTypeString)) {
         return 4;
      } else if ("entityreference".equals(nodeTypeString)) {
         return 5;
      } else if ("entity".equals(nodeTypeString)) {
         return 6;
      } else if ("processinginstruction".equals(nodeTypeString)) {
         return 7;
      } else if ("comment".equals(nodeTypeString)) {
         return 8;
      } else if ("document".equals(nodeTypeString)) {
         return 9;
      } else if ("documenttype".equals(nodeTypeString)) {
         return 10;
      } else if ("documentfragment".equals(nodeTypeString)) {
         return 11;
      } else if ("notation".equals(nodeTypeString)) {
         return 12;
      } else if ("significantwhitespace".equals(nodeTypeString)) {
         return 14;
      } else if ("whitespace".equals(nodeTypeString)) {
         return 13;
      } else {
         throw new ArgumentException(v3.n5("'{0}' does not represent any 'XmlNodeType'.", nodeTypeString));
      }
   }

   private p5 n5(p5 var1) {
      var1.u3(true);
      var1.h0(2);
      if (this.hasSetResolver()) {
         var1.n5(this.getResolver());
      }

      return var1;
   }

   public void load(String filename) {
      p5 var2 = this.n5(new p5(filename, this.getNameTable()));

      try {
         this.load(var2);
      } finally {
         var2.w1();
      }
   }

   public void load(com.aspose.slides.internal.z0k.t4 inStream) {
      p5 var2 = this.n5(new p5(inStream, this.getNameTable()));

      try {
         this.load(var2);
      } finally {
         var2.u6().u3(false);
      }
   }

   public void load(com.aspose.slides.internal.z0k.y1 txtReader) {
      p5 var2 = this.n5(new p5(txtReader, this.getNameTable()));

      try {
         this.load(var2);
      } finally {
         var2.u6().u3(false);
      }
   }

   public void load(c7 reader) {
      try {
         this.setLoading(true);
         this.s7 = true;
         this.removeAll();
         this.fEntRefNodesPresent = false;
         this.fCDataNodesPresent = false;
         this.t2 = true;
         i2 var2 = new i2();
         var2.n5(this, reader, this.x8);
      } finally {
         this.setLoading(false);
         this.s7 = false;
         this.t2 = true;
      }
   }

   public void loadXml(String xml) {
      p5 var2 = this.n5(new p5(new com.aspose.slides.internal.z0k.w1(xml), this.getNameTable()));

      try {
         this.load(var2);
      } finally {
         var2.w1();
      }
   }

   public final com.aspose.slides.internal.l7h.j5 getTextEncoding() {
      if (this.getDeclaration() != null) {
         String var1 = this.getDeclaration().l6();
         if (var1.length() > 0) {
            return com.aspose.slides.internal.l7h.j5.k5(var1);
         }
      }

      return null;
   }

   @Override
   public void setInnerText(String value) {
      throw new InvalidOperationException(v3.n5("The 'InnerText' of a 'Document' node is read-only and cannot be set."));
   }

   @Override
   public String getInnerXml() {
      return super.getInnerXml();
   }

   @Override
   public void setInnerXml(String value) {
      this.loadXml(value);
   }

   public void save(String filename) {
      if (this.getDocumentElement() == null) {
         throw new XmlException("Invalid XML document. {0}", v3.n5("The document does not have a root element."));
      }

      y9 var2 = new y9(filename, this.getTextEncoding());

      try {
         if (!this.x8) {
            var2.n5(1);
         }

         this.writeTo(var2);
         var2.u9();
      } finally {
         var2.a6();
      }
   }

   public void save(com.aspose.slides.internal.z0k.t4 outStream) {
      y9 var2 = new y9(outStream, this.getTextEncoding());
      if (!this.x8) {
         var2.n5(1);
      }

      this.writeTo(var2);
      var2.u9();
   }

   public void save(com.aspose.slides.internal.z0k.a0 writer) {
      y9 var2 = new y9(writer);
      if (!this.x8) {
         var2.n5(1);
      }

      this.save(var2);
   }

   public void save(l1 w) {
      l0 var2 = this.getFirstChild();
      if (var2 != null) {
         if (w.n3() == 0) {
            if (com.aspose.slides.internal.v6g.k5.l6(var2, a1.class)) {
               if (this.getStandalone().length() == 0) {
                  w.t2();
               } else if ("yes".equals(this.getStandalone())) {
                  w.l6(true);
               } else if ("no".equals(this.getStandalone())) {
                  w.l6(false);
               }

               var2 = var2.getNextSibling();
            } else {
               w.t2();
            }
         }

         while (var2 != null) {
            var2.writeTo(w);
            var2 = var2.getNextSibling();
         }

         w.u9();
      }
   }

   @Override
   public void writeTo(l1 w) {
      this.writeContentTo(w);
   }

   @Override
   public void writeContentTo(l1 xw) {
      for (Object recoveredElement$var3$34017 : this) {
         l0 var3 = (l0)recoveredElement$var3$34017;
         var3.writeTo(xw);
      }
   }

   public final void validate(com.aspose.slides.internal.b8c.b4 validationEventHandler) {
      this.validate(validationEventHandler, this);
   }

   public final void validate(com.aspose.slides.internal.b8c.b4 validationEventHandler, l0 nodeToValidate) {
      if (this.c8 != null && this.c8.u3() != 0) {
         XmlDocument var3 = nodeToValidate.getDocument();
         if (var3 != this) {
            throw new ArgumentException(v3.n5("Cannot validate '{0}' because its owner document is not the current document.", "nodeToValidate"));
         }

         if (nodeToValidate == this) {
            this.t2 = false;
         }

         e2 var4 = new e2(this, this.c8, validationEventHandler);
         var4.n5(nodeToValidate);
         if (nodeToValidate == this) {
            this.t2 = true;
         }
      } else {
         throw new InvalidOperationException(
            v3.n5("The XmlSchemaSet on the document is either null or has no schemas in it. Provide Schema information before calling Validate.")
         );
      }
   }

   @Override
   public p9 getEventArgs(l0 node, l0 oldParent, l0 newParent, String oldValue, String newValue, int action) {
      this.t2 = false;
      switch (action) {
         case 0:
            if (this.NodeInsertingDelegate == null && this.NodeInsertedDelegate == null) {
               return null;
            }
            break;
         case 1:
            if (this.NodeRemovingDelegate == null && this.NodeRemovedDelegate == null) {
               return null;
            }
            break;
         case 2:
            if (this.NodeChangingDelegate == null && this.NodeChangedDelegate == null) {
               return null;
            }
      }

      return new p9(node, oldParent, newParent, oldValue, newValue, action);
   }

   public final p9 getInsertEventArgsForLoad(l0 node, l0 newParent) {
      if (this.NodeInsertingDelegate == null && this.NodeInsertedDelegate == null) {
         return null;
      }

      String var3 = node.getValue();
      return new p9(node, null, newParent, var3, var3, 0);
   }

   @Override
   public void beforeEvent(p9 args) {
      if (args != null) {
         switch (args.n5()) {
            case 0:
               if (this.NodeInsertingDelegate != null) {
                  this.NodeInsertingDelegate.n5(this, args);
               }
               break;
            case 1:
               if (this.NodeRemovingDelegate != null) {
                  this.NodeRemovingDelegate.n5(this, args);
               }
               break;
            case 2:
               if (this.NodeChangingDelegate != null) {
                  this.NodeChangingDelegate.n5(this, args);
               }
         }
      }
   }

   @Override
   public void afterEvent(p9 args) {
      if (args != null) {
         switch (args.n5()) {
            case 0:
               if (this.NodeInsertedDelegate != null) {
                  this.NodeInsertedDelegate.n5(this, args);
               }
               break;
            case 1:
               if (this.NodeRemovedDelegate != null) {
                  this.NodeRemovedDelegate.n5(this, args);
               }
               break;
            case 2:
               if (this.NodeChangedDelegate != null) {
                  this.NodeChangedDelegate.n5(this, args);
               }
         }
      }
   }

   public final u8 getDefaultAttribute(m8 elem, String attrPrefix, String attrLocalname, String attrNamespaceURI) {
      com.aspose.slides.internal.b8c.x0 var5 = this.getDtdSchemaInfo();
      com.aspose.slides.internal.b8c.t6 var6 = this.n5(elem);
      if (var6 != null && var6.k7() != null) {
         Dictionary$Enumerator var7 = var6.k7().iterator();

         while (var7.hasNext()) {
            com.aspose.slides.internal.b8c.h9 var8 = (com.aspose.slides.internal.b8c.h9)var7.getValue();
            if ((var8.r4() == 0 || var8.r4() == 3)
               && com.aspose.slides.ms.System.d1.a6(var8.z8().l6(), attrLocalname)
               && (
                  var5.x8() == 1 && com.aspose.slides.ms.System.d1.a6(var8.z8().n5(), attrPrefix)
                     || var5.x8() != 1 && com.aspose.slides.ms.System.d1.a6(var8.z8().n5(), attrNamespaceURI)
               )) {
               return this.n5(var8, attrPrefix, attrLocalname, attrNamespaceURI);
            }
         }
      }

      return null;
   }

   public final String getVersion() {
      a1 var1 = this.getDeclaration();
      return var1 != null ? var1.n5() : null;
   }

   public final String getEncoding() {
      a1 var1 = this.getDeclaration();
      return var1 != null ? var1.l6() : null;
   }

   public final String getStandalone() {
      a1 var1 = this.getDeclaration();
      return var1 != null ? var1.k5() : null;
   }

   public final h1 getEntityNode(String name) {
      if (this.getDocumentType() != null) {
         f8 var2 = this.getDocumentType().n5();
         if (var2 != null) {
            return (h1)var2.l6(name);
         }
      }

      return null;
   }

   @Override
   public com.aspose.slides.internal.b8c.u4 getSchemaInfo() {
      if (this.t2) {
         m8 var1 = this.getDocumentElement();
         if (var1 != null) {
            switch (var1.getSchemaInfo().ak_()) {
               case 1:
                  return ValidSchemaInfo;
               case 2:
                  return InvalidSchemaInfo;
            }
         }
      }

      return NotKnownSchemaInfo;
   }

   @Override
   public String getBaseURI() {
      return this.baseURI;
   }

   public final void setBaseURI(String inBaseURI) {
      this.baseURI = inBaseURI;
   }

   @Override
   public l0 appendChildForLoad(l0 newChild, XmlDocument doc) {
      if (!this.isValidChildType(newChild.getNodeType())) {
         throw new InvalidOperationException(
            v3.n5("The specified node cannot be inserted as the valid child of this node, because the specified node is the wrong type.")
         );
      }

      if (!this.canInsertAfter(newChild, this.getLastChild())) {
         throw new InvalidOperationException(v3.n5("Cannot insert the node in the specified location."));
      }

      p9 var3 = this.getInsertEventArgsForLoad(newChild, this);
      if (var3 != null) {
         this.beforeEvent(var3);
      }

      e0 var4 = (e0)newChild;
      if (this.k5 == null) {
         var4.l6 = var4;
      } else {
         var4.l6 = this.k5.l6;
         this.k5.l6 = var4;
      }

      this.k5 = var4;
      var4.setParentForLoad(this);
      if (var3 != null) {
         this.afterEvent(var3);
      }

      return var4;
   }

   @Override
   public int getXPNodeType() {
      return 0;
   }

   public final boolean hasEntityReferences() {
      return this.fEntRefNodesPresent;
   }

   public final u8 getNamespaceXml() {
      if (this.e2 == null) {
         this.e2 = new u8(this.addAttrXmlName(this.strXmlns, this.strXml, this.strReservedXmlns, null), this);
         this.e2.setValue(this.strReservedXml);
      }

      return this.e2;
   }
}
