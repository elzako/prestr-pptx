package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.o8m.q1;
import com.aspose.slides.internal.o8m.u8;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.c7;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.o8;
import com.aspose.slides.ms.System.Xml.s2;

public class y1 {
   private XmlDocument n5;
   private com.aspose.slides.internal.w1n.n5 l6;
   private o8 k5;
   private Hashtable u3;
   private int a6;
   private int u9;
   private com.aspose.slides.internal.l7h.j5 h0;
   private String c8;
   private int t2 = 0;
   private int s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "http://www.w3.org/2001/04/xmlenc#des-cbc",
      "http://www.w3.org/2001/04/xmlenc#tripledes-cbc",
      "http://www.w3.org/2001/04/xmlenc#aes128-cbc",
      "http://www.w3.org/2001/04/xmlenc#aes192-cbc",
      "http://www.w3.org/2001/04/xmlenc#aes256-cbc"
   );

   public y1() {
      this(new XmlDocument());
   }

   public y1(XmlDocument var1) {
      this(var1, null);
   }

   public y1(XmlDocument var1, com.aspose.slides.internal.w1n.n5 var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = null;
      this.a6 = 5;
      this.u9 = 1;
      this.h0 = com.aspose.slides.internal.l7h.j5.z3();
      this.u3 = new Hashtable(4);
      this.s7 = 20;
   }

   private boolean u3() {
      return this.t2 > this.n5();
   }

   public final int n5() {
      return this.s7;
   }

   public final com.aspose.slides.internal.l7h.j5 l6() {
      return this.h0;
   }

   public final String k5() {
      if (this.c8 == null) {
         this.c8 = com.aspose.slides.ms.System.d1.n5;
      }

      return this.c8;
   }

   private byte[] n5(t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("cipherData");
      }

      com.aspose.slides.internal.g8v.u8 var2 = null;
      com.aspose.slides.internal.z0k.e2 var3 = null;
      if (var1.l6() != null) {
         return var1.l6();
      }

      if (var1.n5() == null) {
         throw new CryptographicException("Cipher data is not specified.");
      }

      if (var1.n5().n5() != null) {
         return var1.n5().n5();
      }

      com.aspose.slides.internal.z0k.t4 var4 = null;
      if (var1.n5().l6() == null) {
         throw new CryptographicException("The specified Uri is not supported.");
      }

      if (var1.n5().l6().length() == 0) {
         String var5 = this.n5 == null ? null : this.n5.getBaseURI();
         j4 var6 = var1.n5().k5();
         if (var6 == null) {
            throw new CryptographicException("The specified Uri is not supported.");
         }

         var4 = var6.n5(this.n5, this.k5, var5);
      } else {
         if (var1.n5().l6().charAt(0) != '#') {
            throw new ArgumentNullException("Unable to resolve Uri {0}.", var1.n5().l6());
         }

         String var13 = i9.l6(var1.n5().l6());
         m8 var16 = this.n5(this.n5, var13);
         if (var16 == null || var16.getOuterXml() == null) {
            throw new CryptographicException("The specified Uri is not supported.");
         }

         var3 = new com.aspose.slides.internal.z0k.e2(this.h0.u3(var16.getOuterXml()));
         String var7 = this.n5 == null ? null : this.n5.getBaseURI();
         j4 var8 = var1.n5().k5();
         if (var8 == null) {
            throw new CryptographicException("The specified Uri is not supported.");
         }

         var4 = var8.n5(var3, this.k5, var7);
      }

      byte[] var14 = null;
      com.aspose.slides.internal.z0k.e2 var17 = new com.aspose.slides.internal.z0k.e2();

      try {
         i9.n5(var4, var17);
         var14 = var17.toArray();
         if (var2 != null) {
            var2.h0();
         }

         if (var3 != null) {
            var3.close();
         }

         var4.close();
      } finally {
         if (var17 != null) {
            var17.dispose();
         }
      }

      var1.n5().n5((byte[])var14);
      return (byte[])var14;
   }

   public m8 n5(XmlDocument var1, String var2) {
      return s0.l6(var1, var2);
   }

   public byte[] n5(w1 var1, String var2) {
      if (var1 == null) {
         throw new ArgumentNullException("encryptedData");
      }

      byte var3 = 0;
      if (var2 == null) {
         if (var1.x8() == null) {
            throw new CryptographicException("Symmetric algorithm is not specified.");
         }

         var2 = var1.x8().n5();
      }

      switch (x8.n5(var2)) {
         case 0:
         case 1:
            var3 = 8;
            break;
         case 2:
         case 3:
         case 4:
            var3 = 16;
            break;
         default:
            throw new CryptographicException("The specified Uri is not supported.");
      }

      byte[] var4 = new byte[var3];
      byte[] var5 = this.n5(var1.y4());
      System.arraycopy(var5, 0, var4, 0, var4.length);
      return var4;
   }

   public u8 l6(w1 var1, String var2) {
      if (var1 == null) {
         throw new ArgumentNullException("encryptedData");
      }

      if (var1.s7() == null) {
         return null;
      }

      IEnumerator var3 = var1.s7().iterator();
      r4 var4 = null;

      label132:
      while (var3.hasNext()) {
         z7 var5 = com.aspose.slides.internal.v6g.k5.n5(var3.next(), z7.class);
         if (var5 != null) {
            String var18 = var5.n5();
            if ((u8)this.u3.get_Item(var18) != null) {
               return (u8)this.u3.get_Item(var18);
            }

            s2 var7 = new s2(this.n5.getNameTable());
            var7.n5("enc", "http://www.w3.org/2001/04/xmlenc#");
            i0 var8 = this.n5.selectNodes("//enc:EncryptedKey", var7);
            if (var8 != null) {
               IEnumerator var9 = var8.iterator();

               try {
                  while (var9.hasNext()) {
                     l0 var10 = (l0)var9.next();
                     m8 var11 = com.aspose.slides.internal.v6g.k5.n5(var10, m8.class);
                     r4 var12 = new r4();
                     var12.n5(var11);
                     if (com.aspose.slides.ms.System.d1.a6(var12.l6(), var18) && com.aspose.slides.ms.System.d1.a6(var12.n5(), this.k5())) {
                        var4 = var12;
                        break label132;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                     ((IDisposable)var9).dispose();
                  }
               }
            }
            break;
         }

         u6 var14 = com.aspose.slides.internal.v6g.k5.n5(var3.next(), u6.class);
         if (var14 != null) {
            String var6 = i9.l6(var14.n5());
            var4 = new r4();
            var4.n5(this.n5(this.n5, var6));
            break;
         }

         o0 var15 = com.aspose.slides.internal.v6g.k5.n5(var3.next(), o0.class);
         if (var15 != null) {
            var4 = var15.n5();
            break;
         }
      }

      if (var4 != null) {
         if (var2 == null) {
            if (var1.x8() == null) {
               throw new CryptographicException("Symmetric algorithm is not specified.");
            }

            var2 = var1.x8().n5();
         }

         byte[] var19 = this.n5(var4);
         if (var19 == null) {
            throw new CryptographicException("Unable to retrieve the decryption key.");
         }

         u8 var20 = z3.n5(u8.class, var2);
         if (var20 == null) {
            throw new CryptographicException("Symmetric algorithm is not specified.");
         }

         var20.k5(var19);
         return var20;
      } else {
         return null;
      }
   }

   public byte[] n5(r4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("encryptedKey");
      }

      if (var1.s7() == null) {
         return null;
      }

      IEnumerator var2 = var1.s7().iterator();
      r4 var3 = null;
      boolean var4 = false;

      while (var2.hasNext()) {
         z7 var5 = com.aspose.slides.internal.v6g.k5.n5(var2.next(), z7.class);
         if (var5 != null) {
            String var28 = var5.n5();
            Object var30 = this.u3.get_Item(var28);
            if (var30 != null) {
               if (var1.y4() != null && var1.y4().l6() != null) {
                  if (com.aspose.slides.internal.v6g.k5.l6(var30, u8.class)) {
                     return n5(var1.y4().l6(), (u8)var30);
                  }

                  var4 = var1.x8() != null && "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p".equals(var1.x8().n5());
                  return n5(var1.y4().l6(), (com.aspose.slides.internal.o8m.z6)var30, var4);
               }

               throw new CryptographicException("Symmetric algorithm is not specified.");
            }
            break;
         }

         t1 var8 = com.aspose.slides.internal.v6g.k5.n5(var2.next(), t1.class);
         if (var8 != null) {
            for (Object recoveredElement$var31$9336 : i9.n5(var8, 1)) {
               com.aspose.slides.internal.f3c.h0 var31 = (com.aspose.slides.internal.f3c.h0)recoveredElement$var31$9336;
               com.aspose.slides.internal.o8m.z6 var10 = var31.r4().c8();

               try {
                  if (var10 != null) {
                     if (var1.y4() != null && var1.y4().l6() != null) {
                        var4 = var1.x8() != null && "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p".equals(var1.x8().n5());
                        return n5(var1.y4().l6(), var10, var4);
                     }

                     throw new CryptographicException("Symmetric algorithm is not specified.");
                  }
               } finally {
                  if (var10 != null) {
                     var10.dispose();
                  }
               }
            }
            break;
         }

         u6 var13 = com.aspose.slides.internal.v6g.k5.n5(var2.next(), u6.class);
         if (var13 != null) {
            String var26 = i9.l6(var13.n5());
            var3 = new r4();
            var3.n5(this.n5(this.n5, var26));

            try {
               this.t2++;
               if (this.u3()) {
                  throw new m1();
               }

               return this.n5(var3);
            } finally {
               this.t2--;
            }
         }

         o0 var15 = com.aspose.slides.internal.v6g.k5.n5(var2.next(), o0.class);
         if (var15 != null) {
            var3 = var15.n5();
            byte[] var6 = this.n5(var3);
            if (var6 != null) {
               String var7 = var1.x8().n5();
               u8 var9 = z3.n5(u8.class, var7);
               if (var9 == null) {
                  throw new CryptographicException("Symmetric algorithm is not specified.");
               }

               var9.k5(var6);
               if (var1.y4() != null && var1.y4().l6() != null) {
                  var9.k5(var6);
                  return n5(var1.y4().l6(), var9);
               }

               throw new CryptographicException("Symmetric algorithm is not specified.");
            }
         }
      }

      return null;
   }

   public final byte[] n5(w1 var1, u8 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("encryptedData");
      }

      if (var2 == null) {
         throw new ArgumentNullException("symmetricAlgorithm");
      }

      byte[] var3 = this.n5(var1.y4());
      int var4 = var2.n3();
      int var5 = var2.y4();
      byte[] var6 = var2.s7();
      byte[] var7 = null;
      if (this.u9 != 2) {
         var7 = this.n5(var1, (String)null);
      }

      byte[] var8 = null;

      try {
         int var9 = 0;
         if (var7 != null) {
            var2.u3(var7);
            var9 = var7.length;
         }

         var2.k5(this.u9);
         var2.u3(this.a6);
         com.aspose.slides.internal.o8m.i1 var10 = var2.e2();
         var8 = var10.n5(var3, var9, var3.length - var9);
      } finally {
         var2.k5(var4);
         var2.u3(var5);
         var2.u3(var6);
      }

      return (byte[])var8;
   }

   public final void n5(m8 var1, byte[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("inputElement");
      }

      if (var2 == null) {
         throw new ArgumentNullException("decryptedData");
      }

      l0 var3 = var1.getParentNode();
      if (var3.getNodeType() == 9) {
         XmlDocument var4 = new XmlDocument();
         var4.setPreserveWhitespace(true);
         String var5 = this.h0.l6(var2);
         com.aspose.slides.internal.z0k.w1 var6 = new com.aspose.slides.internal.z0k.w1(var5);

         try {
            c7 var7 = c7.n5(var6, i9.n5(this.k5));

            try {
               var4.load(var7);
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }

         l0 var26 = var1.getOwnerDocument().importNode(var4.getDocumentElement(), true);
         var3.removeChild(var1);
         var3.appendChild(var26);
      } else {
         m8 var23 = var3.getOwnerDocument().createElement(var3.getPrefix(), var3.getLocalName(), var3.getNamespaceURI());

         try {
            var3.appendChild(var23);
            var23.setInnerXml(this.h0.l6(var2));
            l0 var24 = var23.getFirstChild();
            l0 var25 = var1.getNextSibling();
            Object var27 = null;

            while (var24 != null) {
               var27 = var24.getNextSibling();
               var3.insertBefore(var24, var25);
               var24 = (l0)var27;
            }
         } finally {
            var3.removeChild(var23);
         }

         var3.removeChild(var1);
      }
   }

   public static byte[] n5(byte[] var0, u8 var1) {
      if (var0 == null) {
         throw new ArgumentNullException("keyData");
      } else if (var1 == null) {
         throw new ArgumentNullException("symmetricAlgorithm");
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, q1.class)) {
         return v3.n5(var1.u3(), var0);
      } else if (!com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.o8m.j3.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.o8m.n5.class)) {
         throw new CryptographicException("The specified cryptographic transform is not supported.");
      } else {
         return v3.l6(var1.u3(), var0);
      }
   }

   public static byte[] n5(byte[] var0, com.aspose.slides.internal.o8m.z6 var1, boolean var2) {
      if (var0 == null) {
         throw new ArgumentNullException("keyData");
      } else if (var1 == null) {
         throw new ArgumentNullException("rsa");
      } else if (var2) {
         com.aspose.slides.internal.o8m.j8 var4 = new com.aspose.slides.internal.o8m.j8(var1);
         return var4.n5(var0);
      } else {
         com.aspose.slides.internal.o8m.w2 var3 = new com.aspose.slides.internal.o8m.w2(var1);
         return var3.n5(var0);
      }
   }
}
