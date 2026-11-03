package com.aspose.slides.internal.u3r;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.u8;

class y4 extends e2 implements a6 {
   private final n5 n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "http://ns.adobe.com/xap/1.0/sType/ResourceRef#", "http://ns.adobe.com/xap/1.0/sType/ResourceEvent#", "rdf:Alt", "rdf:Seq", "rdf:Bag"
   );

   public y4(n5 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("rdfRootParser");
      }

      this.n5 = var1;
   }

   @Override
   public final com.aspose.slides.internal.t6q.c8 n5(XmlDocument var1) {
      if (var1 == null) {
         throw new ArgumentNullException("xmlDocument");
      }

      com.aspose.slides.internal.t6q.x8 var2 = this.n5.n5(var1);
      com.aspose.slides.internal.t6q.c8 var3 = new com.aspose.slides.internal.t6q.c8();
      i0 var4 = var1.getElementsByTagName("rdf:RDF");
      if (var4.n5() == 0) {
         throw new com.aspose.slides.internal.z3b.s7(d1.n5("At least 1 {0} node should be provided", new Object[]{"rdf:RDF"}));
      }

      if (var4.n5() > 1) {
         throw new com.aspose.slides.internal.z3b.s7(d1.n5("Only 1 {0} node should be provided", new Object[]{"rdf:RDF"}));
      }

      List var5 = new List();
      IEnumerator var6 = var4.k5(0).getChildNodes().iterator();

      try {
         while (var6.hasNext()) {
            l0 var7 = (l0)var6.next();
            if (d1.u3(var7.getName(), "rdf:Description", (short)5)) {
               var5.addItem(var7);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            ((IDisposable)var6).dispose();
         }
      }

      if (var5.size() > 0) {
         List$Enumerator var35 = var5.iterator();

         try {
            while (var35.hasNext()) {
               l0 var8 = (l0)var35.next();

               IGenericEnumerable var9;
               try {
                  var9 = this.n5(var2, com.aspose.slides.internal.v6g.k5.n5(var8, m8.class));
               } catch (com.aspose.slides.internal.z3b.s7 var30) {
                  throw var30;
               } catch (RuntimeException var31) {
                  throw new com.aspose.slides.internal.z3b.s7("Could not parse rdf description", var31);
               }

               if (var9 != null) {
                  IGenericEnumerator var10 = var9.iterator();

                  try {
                     while (var10.hasNext()) {
                        com.aspose.slides.internal.t6q.h0 var11 = (com.aspose.slides.internal.t6q.h0)var10.next();
                        com.aspose.slides.internal.t6q.h0 var12 = var3.n5(var11.u3());
                        if (var12 == null) {
                           var3.n5(var11);
                        } else {
                           var12.n5(var11);
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                        var10.dispose();
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var35, IDisposable.class)) {
               var35.dispose();
            }
         }
      }

      return var3;
   }

   private IGenericEnumerable<com.aspose.slides.internal.t6q.h0> n5(com.aspose.slides.internal.t6q.x8 var1, m8 var2) {
      if (d1.n5(var2.getNamespaceURI())) {
         throw new com.aspose.slides.internal.z3b.s7(d1.n5("Invalid XMP description tag. Namespace not found. XMP: {0}", new Object[]{var2.getInnerXml()}));
      }

      Dictionary var3 = new Dictionary();
      IEnumerator var4 = var2.getChildNodes().iterator();

      try {
         while (var4.hasNext()) {
            l0 var5 = (l0)var4.next();
            if (var5.getNodeType() == 1) {
               m8 var6 = (m8)var5;
               this.n5(var6, var3, var1);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            ((IDisposable)var4).dispose();
         }
      }

      List var15 = new List();
      Dictionary$Enumerator var16 = var3.iterator();

      try {
         while (var16.hasNext()) {
            KeyValuePair var7 = (KeyValuePair)var16.next();
            var15.addItem(var7.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
            var16.dispose();
         }
      }

      return var15;
   }

   private void n5(m8 var1, Dictionary<String, com.aspose.slides.internal.t6q.h0> var2, com.aspose.slides.internal.t6q.x8 var3) {
      if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(var1.getNamespaceURI())) {
         var3.l6(var1.getPrefix(), var1.getNamespaceURI());
      }

      com.aspose.slides.internal.t6q.h0 var5;
      if (!var2.containsKey(var1.getNamespaceURI())) {
         String var4 = com.aspose.slides.internal.c5i.l6.n5(var1.getPrefix());
         var5 = com.aspose.slides.internal.t6q.t2.n5(var4, var1.getNamespaceURI(), false);
         var2.addItem(var1.getNamespaceURI(), var5);
      } else {
         var5 = (com.aspose.slides.internal.t6q.h0)var2.get_Item(var1.getNamespaceURI());
      }

      if (var1.getChildNodes().n5() > 0) {
         this.n5(var5, var1, var3);
      } else if (var1.getAttributes().size() > 0) {
         com.aspose.slides.internal.a0q.n5 var11 = null;
         IEnumerator var6 = var1.getAttributes().iterator();

         try {
            while (var6.hasNext()) {
               u8 var7 = (u8)var6.next();
               if (!d1.n5(var7.getPrefix()) && !d1.n5(var7.getNamespaceURI())) {
                  switch (l6.n5(var7.getNamespaceURI())) {
                     case 0:
                        if (var11 == null) {
                           var11 = new com.aspose.slides.internal.n9p.n5();
                        }
                        break;
                     case 1:
                        if (var11 == null) {
                           var11 = new com.aspose.slides.internal.w3o.n5();
                        }
                        break;
                     default:
                        var11 = new com.aspose.slides.internal.a0q.n5(var7.getPrefix(), var7.getNamespaceURI());
                  }

                  var11.n5(var7.getName(), var7.getValue());
                  var5.u9(var7.getPrefix(), var7.getNamespaceURI());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               ((IDisposable)var6).dispose();
            }
         }

         if (var11 != null) {
            var5.n5(var1.getName(), var11);
         }
      }
   }

   private void n5(com.aspose.slides.internal.t6q.h0 var1, l0 var2, com.aspose.slides.internal.t6q.x8 var3) {
      if (var2.hasChildNodes()) {
         IEnumerator var4 = var2.getChildNodes().iterator();

         try {
            while (var4.hasNext()) {
               l0 var5 = (l0)var4.next();
               switch (var5.getNodeType()) {
                  case 1:
                     com.aspose.slides.internal.t6q.l6 var6 = null;
                     if (this.n5(var5)) {
                        switch (l6.n5(var5.getName())) {
                           case 2:
                              var6 = new com.aspose.slides.internal.t6q.l6(2);
                              break;
                           case 3:
                              var6 = new com.aspose.slides.internal.t6q.l6(1);
                              break;
                           case 4:
                              var6 = new com.aspose.slides.internal.t6q.l6(0);
                        }
                     }

                     if (var6 != null) {
                        var1.n5(var2.getName(), var6);
                        this.n5(var6, var5);
                     } else {
                        this.n5(var1, var5, var3);
                     }
                     break;
                  case 3:
                     String var7 = var3.l6(var2.getPrefix());
                     if (var7 == null) {
                        this.l6(var1, var2.getParentNode(), var3);
                        return;
                     }

                     String var8 = var2.getName();
                     if (d1.a6(var7, var1.u3())) {
                        var8 = d1.n5("{0}:{1}",new Object[]{ var1.k5(), var2.getLocalName()});
                     }

                     var1.n5(var8, var5.getValue());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               ((IDisposable)var4).dispose();
            }
         }
      } else {
         var1.n5(var2.getName(), var2.getInnerText());
      }
   }

   private boolean n5(l0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("node");
      } else {
         return "rdf:Alt".equals(var1.getName()) || "rdf:Seq".equals(var1.getName()) || "rdf:Bag".equals(var1.getName());
      }
   }

   private void n5(com.aspose.slides.internal.t6q.l6 var1, l0 var2) {
      IEnumerator var3 = var2.getChildNodes().iterator();

      try {
         while (var3.hasNext()) {
            l0 var4 = (l0)var3.next();
            if (var4.getNodeType() == 1) {
               if ("rdf:li".equals(d1.u9(var4.getName()))) {
                  this.n5(var1, var4);
               }
            } else if (var4.getNodeType() == 3) {
               var1.n5(var4.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            ((IDisposable)var3).dispose();
         }
      }
   }

   private void l6(com.aspose.slides.internal.t6q.h0 var1, l0 var2, com.aspose.slides.internal.t6q.x8 var3) {
      String var4 = var3.l6(var2.getPrefix());
      String var5 = var2.getName();
      if (d1.a6(var4, var1.u3())) {
         var5 = d1.n5("{0}:{1}",new Object[]{ var1.k5(), var2.getLocalName()});
      }

      if (!var1.l6(var5)) {
         com.aspose.slides.internal.a0q.n5 var6 = null;
         IEnumerator var7 = var2.getChildNodes().iterator();

         try {
            while (var7.hasNext()) {
               l0 var8 = (l0)var7.next();
               if (var8.getNodeType() == 1) {
                  if (var6 == null) {
                     switch (l6.n5(var8.getNamespaceURI())) {
                        case 0:
                           var6 = new com.aspose.slides.internal.n9p.n5();
                           break;
                        case 1:
                           var6 = new com.aspose.slides.internal.w3o.n5();
                           break;
                        default:
                           var6 = new com.aspose.slides.internal.a0q.n5(var8.getPrefix(), var8.getNamespaceURI());
                     }
                  }

                  var6.n5(var8.getName(), var8.getInnerText());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               ((IDisposable)var7).dispose();
            }
         }

         if (var6 != null) {
            var1.u9(var6.l6(), var6.k5());
            var1.n5(var5, var6);
         }
      }
   }
}
