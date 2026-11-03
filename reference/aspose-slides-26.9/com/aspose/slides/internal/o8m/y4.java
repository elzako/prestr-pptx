package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.exceptions.OverflowException;
import java.util.TreeMap;

public class y4 {
   private static final Object n5 = new Object();
   private static TreeMap<String, Class> l6;
   private static TreeMap<String, String> k5;
   private static TreeMap<String, String> u3;

   private static void n5() {
      TreeMap var0 = new TreeMap<>(com.aspose.slides.ms.System.p6.u3());
      TreeMap var1 = new TreeMap<>(com.aspose.slides.ms.System.p6.u3());
      Class<y1> var2 = y1.class;
      Class<d2> var3 = d2.class;
      Class<d5> var4 = d5.class;
      Class<s3> var5 = s3.class;
      Class<p8> var6 = p8.class;
      Class<n1> var7 = n1.class;
      Class<n1> var8 = n1.class;
      Class<i6> var9 = i6.class;
      Class<r8> var10 = r8.class;
      Class<y5> var11 = y5.class;
      Class<h6> var12 = h6.class;
      Class<v4> var13 = v4.class;
      Class<e9> var14 = e9.class;
      Class<m1> var15 = m1.class;
      Class<t4> var16 = t4.class;
      Class<u5> var17 = u5.class;
      Class<a3> var18 = a3.class;
      Class<j9> var19 = j9.class;
      Class<n1> var20 = n1.class;
      var0.put("RandomNumberGenerator", var19);
      var0.put("System.Security.Cryptography." + i9.class.getSimpleName(), var19);
      var0.put("SHA", var12);
      var0.put("SHA1", var12);
      var0.put("System.Security.Cryptography.SHA1", var12);
      var0.put("System.Security.Cryptography.HashAlgorithm", var12);
      var0.put("System.Security.Cryptography." + s4.class.getSimpleName(), var12);
      var0.put("System.Security.Cryptography." + f2.class.getSimpleName(), var12);
      var0.put("MD5", var13);
      var0.put("System.Security.Cryptography.MD5", var13);
      var0.put("System.Security.Cryptography." + z7.class.getSimpleName(), var13);
      var0.put("SHA256", var9);
      var0.put("SHA-256", var9);
      var0.put("System.Security.Cryptography.SHA256", var9);
      var0.put("System.Security.Cryptography." + l4.class.getSimpleName(), var9);
      var0.put("SHA384", var10);
      var0.put("SHA-384", var10);
      var0.put("System.Security.Cryptography.SHA384", var10);
      var0.put("System.Security.Cryptography." + a7.class.getSimpleName(), var10);
      var0.put("SHA512", var11);
      var0.put("SHA-512", var11);
      var0.put("System.Security.Cryptography.SHA512", var11);
      var0.put("System.Security.Cryptography." + r1.class.getSimpleName(), var11);
      var0.put("System.Security.Cryptography.HMAC", var3);
      var0.put("System.Security.Cryptography.KeyedHashAlgorithm", var3);
      var0.put("System.Security.Cryptography." + y2.class.getSimpleName(), var3);
      var0.put("System.Security.Cryptography." + b3.class.getSimpleName(), var3);
      var0.put("HMACMD5", var2);
      var0.put("System.Security.Cryptography.HMACMD5", var2);
      var0.put("System.Security.Cryptography." + y1.class.getSimpleName(), var2);
      var0.put("HMACSHA1", var3);
      var0.put("System.Security.Cryptography.HMACSHA1", var3);
      var0.put("System.Security.Cryptography." + d2.class.getSimpleName(), var3);
      var0.put("HMACSHA256", var4);
      var0.put("System.Security.Cryptography.HMACSHA256", var4);
      var0.put("System.Security.Cryptography." + d5.class.getSimpleName(), var4);
      var0.put("HMACSHA384", var5);
      var0.put("System.Security.Cryptography.HMACSHA384", var5);
      var0.put("System.Security.Cryptography." + s3.class.getSimpleName(), var5);
      var0.put("HMACSHA512", var6);
      var0.put("System.Security.Cryptography.HMACSHA512", var6);
      var0.put("System.Security.Cryptography." + p8.class.getSimpleName(), var6);
      var0.put("RSA", var14);
      var0.put("System.Security.Cryptography.RSA", var14);
      var0.put("System.Security.Cryptography.AsymmetricAlgorithm", var14);
      var0.put("System.Security.Cryptography." + z6.class.getSimpleName(), var14);
      var0.put("System.Security.Cryptography." + a6.class.getSimpleName(), var14);
      var0.put("DSA", var15);
      var0.put("System.Security.Cryptography.DSA", var15);
      var0.put("System.Security.Cryptography." + z3.class.getSimpleName(), var15);
      var0.put("DES", var16);
      var0.put("System.Security.Cryptography.DES", var16);
      var0.put("System.Security.Cryptography." + z1.class.getSimpleName(), var16);
      var0.put("3DES", var17);
      var0.put("TripleDES", var17);
      var0.put("Triple DES", var17);
      var0.put("System.Security.Cryptography.TripleDES", var17);
      var0.put("System.Security.Cryptography." + q1.class.getSimpleName(), var17);
      var0.put("RC2", var18);
      var0.put("System.Security.Cryptography.RC2", var18);
      var0.put("System.Security.Cryptography." + f0.class.getSimpleName(), var18);
      var0.put("Rijndael", var7);
      var0.put("System.Security.Cryptography.Rijndael", var7);
      var0.put("System.Security.Cryptography." + j3.class.getSimpleName(), var7);
      var0.put("System.Security.Cryptography.SymmetricAlgorithm", var7);
      var0.put("System.Security.Cryptography." + u8.class.getSimpleName(), var7);
      var0.put("AES", var20);
      var0.put("AesCryptoServiceProvider", var20);
      var0.put("System.Security.Cryptography.AesCryptoServiceProvider", var20);
      var0.put("AesManaged", var8);
      var0.put("System.Security.Cryptography.AesManaged", var8);
      var0.put("http://www.w3.org/2000/09/xmldsig#sha1", var12);
      var0.put("http://www.w3.org/2001/04/xmlenc#sha256", var9);
      var0.put("http://www.w3.org/2001/04/xmlenc#sha512", var11);
      var0.put("http://www.w3.org/2001/04/xmlenc#des-cbc", var16);
      var0.put("http://www.w3.org/2001/04/xmlenc#tripledes-cbc", var17);
      var0.put("http://www.w3.org/2001/04/xmlenc#kw-tripledes", var17);
      var0.put("http://www.w3.org/2001/04/xmlenc#aes128-cbc", var7);
      var0.put("http://www.w3.org/2001/04/xmlenc#kw-aes128", var7);
      var0.put("http://www.w3.org/2001/04/xmlenc#aes192-cbc", var7);
      var0.put("http://www.w3.org/2001/04/xmlenc#kw-aes192", var7);
      var0.put("http://www.w3.org/2001/04/xmlenc#aes256-cbc", var7);
      var0.put("http://www.w3.org/2001/04/xmlenc#kw-aes256", var7);
      var0.put("http://www.w3.org/2000/09/xmldsig#hmac-sha1", var3);
      var0.put("http://www.w3.org/2001/04/xmldsig-more#md5", var13);
      var0.put("http://www.w3.org/2001/04/xmldsig-more#sha384", var10);
      var0.put("http://www.w3.org/2001/04/xmldsig-more#hmac-md5", var2);
      var0.put("http://www.w3.org/2001/04/xmldsig-more#hmac-sha256", var4);
      var0.put("http://www.w3.org/2001/04/xmldsig-more#hmac-sha384", var5);
      var0.put("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512", var6);
      var1.put("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", "System.Security.Cryptography.Xml.XmlDsigC14NTransform");
      var1.put("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", "System.Security.Cryptography.Xml.XmlDsigC14NWithCommentsTransform");
      var1.put("http://www.w3.org/2001/10/xml-exc-c14n#", "System.Security.Cryptography.Xml.XmlDsigExcC14NTransform");
      var1.put("http://www.w3.org/2001/10/xml-exc-c14n#WithComments", "System.Security.Cryptography.Xml.XmlDsigExcC14NWithCommentsTransform");
      var1.put("http://www.w3.org/2000/09/xmldsig#base64", "System.Security.Cryptography.Xml.XmlDsigBase64Transform");
      var1.put("http://www.w3.org/TR/1999/REC-xpath-19991116", "System.Security.Cryptography.Xml.XmlDsigXPathTransform");
      var1.put("http://www.w3.org/TR/1999/REC-xslt-19991116", "System.Security.Cryptography.Xml.XmlDsigXsltTransform");
      var1.put("http://www.w3.org/2000/09/xmldsig#enveloped-signature", "System.Security.Cryptography.Xml.XmlDsigEnvelopedSignatureTransform");
      var1.put("http://www.w3.org/2002/07/decrypt#XML", "System.Security.Cryptography.Xml.XmlDecryptionTransform");
      var1.put("urn:mpeg:mpeg21:2003:01-REL-R-NS:licenseTransform", "System.Security.Cryptography.Xml.XmlLicenseTransform");
      var1.put("http://www.w3.org/2000/09/xmldsig# X509Data", "System.Security.Cryptography.Xml.KeyInfoX509Data");
      var1.put("http://www.w3.org/2000/09/xmldsig# KeyName", "System.Security.Cryptography.Xml.KeyInfoName");
      var1.put("http://www.w3.org/2000/09/xmldsig# KeyValue/DSAKeyValue", "System.Security.Cryptography.Xml.DSAKeyValue");
      var1.put("http://www.w3.org/2000/09/xmldsig# KeyValue/RSAKeyValue", "System.Security.Cryptography.Xml.RSAKeyValue");
      var1.put("http://www.w3.org/2000/09/xmldsig# RetrievalMethod", "System.Security.Cryptography.Xml.KeyInfoRetrievalMethod");
      var1.put("http://www.w3.org/2001/04/xmlenc# EncryptedKey", "System.Security.Cryptography.Xml.KeyInfoEncryptedKey");
      var1.put("2.5.29.10", "System.Security.Cryptography.X509Certificates.X509BasicConstraintsExtension");
      var1.put("2.5.29.19", "System.Security.Cryptography.X509Certificates.X509BasicConstraintsExtension");
      var1.put("2.5.29.14", "System.Security.Cryptography.X509Certificates.X509SubjectKeyIdentifierExtension");
      var1.put("2.5.29.15", "System.Security.Cryptography.X509Certificates.X509KeyUsageExtension");
      var1.put("2.5.29.37", "System.Security.Cryptography.X509Certificates.X509EnhancedKeyUsageExtension");
      var1.put("X509Chain", "System.Security.Cryptography.X509Certificates.X509Chain");
      var1.put("1.2.840.113549.1.9.3", "System.Security.Cryptography.Pkcs.Pkcs9ContentType");
      var1.put("1.2.840.113549.1.9.4", "System.Security.Cryptography.Pkcs.Pkcs9MessageDigest");
      var1.put("1.2.840.113549.1.9.5", "System.Security.Cryptography.Pkcs.Pkcs9SigningTime");
      var1.put("1.3.6.1.4.1.311.88.2.1", "System.Security.Cryptography.Pkcs.Pkcs9DocumentName");
      var1.put("1.3.6.1.4.1.311.88.2.2", "System.Security.Cryptography.Pkcs.Pkcs9DocumentDescription");
      TreeMap var21 = new TreeMap<>(com.aspose.slides.ms.System.p6.u3());
      String var22 = "1.2.840.113549.1.9.16.3.6";
      String var23 = "1.2.840.113549.2.5";
      String var24 = "1.2.840.113549.3.2";
      String var25 = "1.2.840.113549.3.7";
      String var26 = "1.3.14.3.2.7";
      String var27 = "1.3.14.3.2.26";
      String var28 = "2.16.840.1.101.3.4.2.1";
      String var29 = "2.16.840.1.101.3.4.2.2";
      String var30 = "2.16.840.1.101.3.4.2.3";
      String var31 = "1.3.36.3.2.1";
      var21.put("SHA", "1.3.14.3.2.26");
      var21.put("SHA1", "1.3.14.3.2.26");
      var21.put("System.Security.Cryptography.SHA1", "1.3.14.3.2.26");
      var21.put("System.Security.Cryptography.SHA1CryptoServiceProvider", "1.3.14.3.2.26");
      var21.put("System.Security.Cryptography.SHA1Cng", "1.3.14.3.2.26");
      var21.put("System.Security.Cryptography.SHA1Managed", "1.3.14.3.2.26");
      var21.put(s4.class.getName(), "1.3.14.3.2.26");
      var21.put(h6.class.getName(), "1.3.14.3.2.26");
      var21.put(c3.class.getName(), "1.3.14.3.2.26");
      var21.put("System.Security.Cryptography." + s4.class.getSimpleName(), "1.3.14.3.2.26");
      var21.put("System.Security.Cryptography." + h6.class.getSimpleName(), "1.3.14.3.2.26");
      var21.put("System.Security.Cryptography." + c3.class.getSimpleName(), "1.3.14.3.2.26");
      var21.put("SHA256", "2.16.840.1.101.3.4.2.1");
      var21.put("System.Security.Cryptography.SHA256", "2.16.840.1.101.3.4.2.1");
      var21.put("System.Security.Cryptography.SHA256CryptoServiceProvider", "2.16.840.1.101.3.4.2.1");
      var21.put("System.Security.Cryptography.SHA256Cng", "2.16.840.1.101.3.4.2.1");
      var21.put("System.Security.Cryptography.SHA256Managed", "2.16.840.1.101.3.4.2.1");
      var21.put(l4.class.getName(), "2.16.840.1.101.3.4.2.1");
      var21.put(i6.class.getName(), "2.16.840.1.101.3.4.2.1");
      var21.put("System.Security.Cryptography." + l4.class.getSimpleName(), "2.16.840.1.101.3.4.2.1");
      var21.put("System.Security.Cryptography." + i6.class.getSimpleName(), "2.16.840.1.101.3.4.2.1");
      var21.put("SHA384", "2.16.840.1.101.3.4.2.2");
      var21.put("System.Security.Cryptography.SHA384", "2.16.840.1.101.3.4.2.2");
      var21.put("System.Security.Cryptography.SHA384CryptoServiceProvider", "2.16.840.1.101.3.4.2.2");
      var21.put("System.Security.Cryptography.SHA384Cng", "2.16.840.1.101.3.4.2.2");
      var21.put("System.Security.Cryptography.SHA384Managed", "2.16.840.1.101.3.4.2.2");
      var21.put(a7.class.getName(), "2.16.840.1.101.3.4.2.2");
      var21.put(r8.class.getName(), "2.16.840.1.101.3.4.2.2");
      var21.put("System.Security.Cryptography." + a7.class.getSimpleName(), "2.16.840.1.101.3.4.2.2");
      var21.put("System.Security.Cryptography." + r8.class.getSimpleName(), "2.16.840.1.101.3.4.2.2");
      var21.put("SHA512", "2.16.840.1.101.3.4.2.3");
      var21.put("System.Security.Cryptography.SHA512", "2.16.840.1.101.3.4.2.3");
      var21.put("System.Security.Cryptography.SHA512CryptoServiceProvider", "2.16.840.1.101.3.4.2.3");
      var21.put("System.Security.Cryptography.SHA512Cng", "2.16.840.1.101.3.4.2.3");
      var21.put("System.Security.Cryptography.SHA512Managed", "2.16.840.1.101.3.4.2.3");
      var21.put(r1.class.getName(), "2.16.840.1.101.3.4.2.3");
      var21.put(y5.class.getName(), "2.16.840.1.101.3.4.2.3");
      var21.put("System.Security.Cryptography." + r1.class.getSimpleName(), "2.16.840.1.101.3.4.2.3");
      var21.put("System.Security.Cryptography." + y5.class.getSimpleName(), "2.16.840.1.101.3.4.2.3");
      var21.put("RIPEMD160", "1.3.36.3.2.1");
      var21.put("System.Security.Cryptography.RIPEMD160", "1.3.36.3.2.1");
      var21.put("System.Security.Cryptography.RIPEMD160Managed", "1.3.36.3.2.1");
      var21.put("System.Security.Cryptography." + x9.class.getSimpleName(), "1.3.36.3.2.1");
      var21.put("System.Security.Cryptography." + y0.class.getSimpleName(), "1.3.36.3.2.1");
      var21.put(x9.class.getName(), "1.3.36.3.2.1");
      var21.put(y0.class.getName(), "1.3.36.3.2.1");
      var21.put("MD5", "1.2.840.113549.2.5");
      var21.put("System.Security.Cryptography.MD5", "1.2.840.113549.2.5");
      var21.put("System.Security.Cryptography.MD5CryptoServiceProvider", "1.2.840.113549.2.5");
      var21.put("System.Security.Cryptography.MD5Managed", "1.2.840.113549.2.5");
      var21.put("System.Security.Cryptography." + z7.class.getSimpleName(), "1.2.840.113549.2.5");
      var21.put("System.Security.Cryptography." + v4.class.getSimpleName(), "1.2.840.113549.2.5");
      var21.put(z7.class.getName(), "1.2.840.113549.2.5");
      var21.put(v4.class.getName(), "1.2.840.113549.2.5");
      var21.put("TripleDESKeyWrap", "1.2.840.113549.1.9.16.3.6");
      var21.put("RC2", "1.2.840.113549.3.2");
      var21.put("System.Security.Cryptography.RC2CryptoServiceProvider", "1.2.840.113549.3.2");
      var21.put("System.Security.Cryptography." + a3.class.getSimpleName(), "1.2.840.113549.3.2");
      var21.put(a3.class.getName(), "1.2.840.113549.3.2");
      var21.put("DES", "1.3.14.3.2.7");
      var21.put("System.Security.Cryptography.DESCryptoServiceProvider", "1.3.14.3.2.7");
      var21.put("System.Security.Cryptography." + t4.class.getSimpleName(), "1.3.14.3.2.7");
      var21.put(t4.class.getName(), "1.3.14.3.2.7");
      var21.put("TripleDES", "1.2.840.113549.3.7");
      var21.put("System.Security.Cryptography.TripleDESCryptoServiceProvider", "1.2.840.113549.3.7");
      var21.put("System.Security.Cryptography." + u5.class.getSimpleName(), "1.2.840.113549.3.7");
      var21.put(u5.class.getName(), "1.2.840.113549.3.7");
      Class<a0> var32 = a0.class;
      var0.put("HMACRIPEMD160", var32);
      var0.put("System.Security.Cryptography.HMACRIPEMD160", var32);
      var0.put("System.Security.Cryptography." + a0.class.getSimpleName(), var32);
      var0.put("http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160", var32);
      Class<o0> var33 = o0.class;
      Class<j5> var34 = j5.class;
      var0.put("http://www.w3.org/2000/09/xmldsig#dsa-sha1", var34);
      var0.put("System.Security.Cryptography.DSASignatureDescription", var34);
      var0.put("System.Security.Cryptography." + j5.class.getSimpleName(), var34);
      var0.put("MACTripleDES", var33);
      var0.put("System.Security.Cryptography.MACTripleDES", var33);
      var0.put("System.Security.Cryptography." + o0.class.getSimpleName(), var33);
      Class<v8> var35 = v8.class;
      var0.put("http://www.w3.org/2000/09/xmldsig#rsa-sha1", var35);
      var0.put("System.Security.Cryptography.RSASignatureDescription", var35);
      String var36 = y0.class.getName();
      var1.put("RIPEMD160", var36);
      var1.put("RIPEMD-160", var36);
      var1.put("System.Security.Cryptography.RIPEMD160", var36);
      var1.put("System.Security.Cryptography.RIPEMD160Managed", var36);
      var1.put("System.Security.Cryptography." + x9.class.getSimpleName(), var36);
      var1.put("System.Security.Cryptography." + y0.class.getSimpleName(), var36);
      var1.put("http://www.w3.org/2001/04/xmlenc#ripemd160", var36);
      l6 = var0;
      k5 = var1;
      u3 = var21;
   }

   public static Object n5(String var0) {
      return n5(var0, null);
   }

   public static Object n5(String var0, Object... var1) {
      if (var0 == null) {
         throw new ArgumentNullException("name");
      }

      synchronized (n5) {
         if (l6 == null) {
            n5();
         }
      }

      try {
         Class var10 = null;
         Class[] var3 = new Class[]{var10};
         boolean var4 = !com.aspose.slides.internal.w4w.k5.n5(l6, var0, var3);
         var10 = var3[0];
         if (var4) {
            String var5 = null;
            String[] var6 = new String[]{var5};
            boolean var7 = !com.aspose.slides.internal.w4w.k5.n5(k5, var0, var6);
            var5 = var6[0];
            if (var7) {
               var5 = var0;
            }

            if (var5.startsWith("System.Security.Cryptography")) {
               var5 = var5.replace("System.Security.Cryptography", y4.class.getPackage().getName());
            }

            var10 = Class.forName(var5);
         }

         if (var10 == null) {
            return null;
         }

         if (var1 != null && var1.length > 0) {
            com.aspose.slides.ms.System.y8[] var13 = new com.aspose.slides.ms.System.y8[var1.length];

            for (int var14 = 0; var14 < var1.length; var14++) {
               var13[var14] = com.aspose.slides.internal.v6g.k5.n5(var1[var14].getClass());
            }

            return com.aspose.slides.internal.v6g.k5.n5(var10).n5(var13).n5(var1);
         } else {
            return var10.newInstance();
         }
      } catch (Exception var8) {
         return null;
      }
   }

   public static String l6(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("name");
      }

      synchronized (n5) {
         if (u3 == null) {
            n5();
         }
      }

      Object var4 = null;
      String[] var2 = new String[]{(String)var4};
      com.aspose.slides.internal.w4w.k5.n5(u3, var0, var2);
      return var2[0];
   }

   public static byte[] k5(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("str");
      }

      char[] var1 = new char[]{'.'};
      String[] var2 = com.aspose.slides.ms.System.d1.u9(var0, var1);
      if (var2.length < 2) {
         throw new CryptographicUnexpectedOperationException(com.aspose.slides.internal.x8w.z3.n5("OID must have at least two parts"));
      }

      byte[] var3 = new byte[var0.length()];

      try {
         byte var4 = com.aspose.slides.ms.System.z3.k5(var2[0]);
         byte var5 = com.aspose.slides.ms.System.z3.k5(var2[1]);
         var3[2] = com.aspose.slides.ms.System.z3.u3((var4 & 255) * 40 + (var5 & 255));
      } catch (com.aspose.slides.exceptions.Exception var10) {
         throw new CryptographicUnexpectedOperationException(com.aspose.slides.internal.x8w.z3.n5("Invalid OID"));
      }

      int var11 = 3;

      for (int var12 = 2; var12 < var2.length; var12++) {
         long var6 = com.aspose.slides.ms.System.z3.a6(var2[var12]);
         if (var6 > 127L) {
            byte[] var8 = n5(var6);
            com.aspose.slides.ms.System.y4.n5(var8, 0, var3, var11, var8.length);
            var11 += var8.length;
         } else {
            var3[var11++] = com.aspose.slides.ms.System.z3.u3(var6);
         }
      }

      byte var13 = 2;
      byte[] var9 = new byte[var11];
      var9[0] = 6;
      if (var11 > 127) {
         throw new CryptographicUnexpectedOperationException(com.aspose.slides.internal.x8w.z3.n5("OID > 127 bytes"));
      }

      var9[1] = com.aspose.slides.ms.System.z3.u3(var11 - 2);
      com.aspose.slides.ms.System.y4.n5(var3, var13, var9, var13, var11 - var13);
      return var9;
   }

   private static byte[] n5(long var0) {
      if (var0 <= 2147483647L && var0 >= -2147483648L) {
         long var2 = var0;

         int var4;
         for (var4 = 1; var2 > 127L; var4++) {
            var2 >>= 7;
         }

         byte[] var5 = new byte[var4];

         for (int var6 = 0; var6 < var4; var6++) {
            var2 = var0 >> 7 * var6;
            var2 &= 127L;
            if (var6 != 0) {
               var2 += 128L;
            }

            var5[var4 - var6 - 1] = com.aspose.slides.ms.System.z3.u3(var2);
         }

         return var5;
      } else {
         throw new OverflowException(com.aspose.slides.internal.x8w.z3.n5("Part of OID doesn't fit in Int32"));
      }
   }

   @Override
   public String toString() {
      String var1 = com.aspose.slides.ms.System.j8.n5(this).s7().substring(com.aspose.slides.ms.System.j8.n5(this).s7().lastIndexOf(46) + 1);
      return "System.Security.Cryptography." + var1;
   }
}
