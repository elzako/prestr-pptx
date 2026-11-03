package com.aspose.slides.internal.g7i;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.s3;
import com.aspose.slides.ms.System.u3;

public class k5 {
   public static boolean n5(float var0) {
      return var0 > 0.9999999F && var0 < 1.0000001F;
   }

   public static float l6(float var0) {
      return var0 < 0.0F ? 0.0F : var0;
   }

   public static float k5(float var0) {
      if (var0 < 0.0F || n1.u3(var0)) {
         return 0.0F;
      } else {
         return !(var0 > 1.0F) && !n1.l6(var0) && !n1.a6(var0) && !n1.k5(var0) ? var0 : 1.0F;
      }
   }

   public static void n5(float[] var0) {
      for (int var1 = 0; var1 < 3; var1++) {
         var0[var1] = k5(var0[var1]);
      }
   }

   public static boolean n5(long var0, long var2) {
      return var0 == var2 || n5(var0) && n5(var2) || l6(var0) && l6(var2);
   }

   public static boolean n5(long var0) {
      return var0 == 1482250784L || var0 == 1281450528L;
   }

   public static boolean l6(long var0) {
      return var0 == 1129142603L || var0 == 876825682L;
   }

   public static byte k5(long var0) {
      switch ((int)var0) {
         case 1129142603:
            return 4;
         case 1196573017:
            return 1;
         case 1281450528:
         case 1380401696:
         case 1482250784:
            return 3;
         default:
            throw new NotSupportedException(d1.n5("Not supported ColorSpace: {0}", new Object[]{s3.n5(com.aspose.slides.internal.w2i.k5.class, var0)}));
      }
   }

   public static boolean l6(float[] var0) {
      float var1 = var0[4] * var0[8];
      float var2 = var0[7] * var0[5];
      float var3 = var0[3] * var0[8];
      float var4 = var0[6] * var0[5];
      float var5 = var0[3] * var0[7];
      float var6 = var0[6] * var0[4];
      float var7 = var0[0] * (var1 - var2) - var0[1] * (var3 - var4) + var0[2] * (var5 - var6);
      if (var7 == 0.0F) {
         return false;
      }

      float[] var8 = new float[]{
         var1 - var2,
         -(var3 - var4),
         var5 - var6,
         -(var0[1] * var0[8] - var0[7] * var0[2]),
         var0[0] * var0[8] - var0[6] * var0[2],
         -(var0[0] * var0[7] - var0[6] * var0[1]),
         var0[1] * var0[5] - var0[4] * var0[2],
         -(var0[0] * var0[5] - var0[3] * var0[2]),
         var0[0] * var0[4] - var0[3] * var0[1]
      };
      var0[0] = var8[0] / var7;
      var0[1] = var8[3] / var7;
      var0[2] = var8[6] / var7;
      var0[3] = var8[1] / var7;
      var0[4] = var8[4] / var7;
      var0[5] = var8[7] / var7;
      var0[6] = var8[2] / var7;
      var0[7] = var8[5] / var7;
      var0[8] = var8[8] / var7;
      return true;
   }

   public static double[][] n5(double[][] var0) {
      double[][] var1 = new double[u3.n5(var0, 2).a6(0)][u3.n5(var0, 2).a6(1)];
      double var2 = var0[1][1] * var0[2][2] * var0[3][3]
         - var0[1][1] * var0[2][3] * var0[3][2]
         - var0[1][2] * var0[2][1] * var0[3][3]
         + var0[1][2] * var0[2][3] * var0[3][1]
         + var0[1][3] * var0[2][1] * var0[3][2]
         - var0[1][3] * var0[2][2] * var0[3][1];
      if (!(var2 > 0.0) && !(var2 < 0.0)) {
         throw new com.aspose.slides.internal.d3l.u3("Determinant of source matrix is 0.0");
      }

      double var4 = var0[2][2] * var0[3][3] - var0[2][3] * var0[3][2];
      double var6 = -1.0 * (var0[2][1] * var0[3][3] - var0[2][3] * var0[3][1]);
      double var8 = var0[2][1] * var0[3][2] - var0[2][2] * var0[3][1];
      double var10 = -1.0 * (var0[1][2] * var0[3][3] - var0[1][3] * var0[3][2]);
      double var12 = var0[1][1] * var0[3][3] - var0[1][3] * var0[3][1];
      double var14 = -1.0 * (var0[1][1] * var0[3][2] - var0[1][2] * var0[3][1]);
      double var16 = var0[1][2] * var0[2][3] - var0[1][3] * var0[2][2];
      double var18 = -1.0 * (var0[1][1] * var0[2][3] - var0[1][3] * var0[2][1]);
      double var20 = var0[1][1] * var0[2][2] - var0[1][2] * var0[2][1];
      var1[1][1] = var4 / var2;
      var1[1][2] = var10 / var2;
      var1[1][3] = var16 / var2;
      var1[2][1] = var6 / var2;
      var1[2][2] = var12 / var2;
      var1[2][3] = var18 / var2;
      var1[3][1] = var8 / var2;
      var1[3][2] = var14 / var2;
      var1[3][3] = var20 / var2;
      return var1;
   }

   public static String n5(int var0) {
      switch (var0) {
         case 1482250784:
            return "XyzType (XyzArrayType)";
         case 1650877472:
            return "UcrBgType";
         case 1667789421:
            return "ChromaticityType";
         case 1668051567:
            return "ColorantOrderType";
         case 1668051572:
            return "ColorantTableType";
         case 1668441193:
            return "CrdInfoType";
         case 1668641398:
            return "CurveType";
         case 1684108385:
            return "DataType";
         case 1684370275:
            return "TextDescriptionType";
         case 1684371059:
            return "DeviceSettingsType";
         case 1684628340:
            return "DictType";
         case 1685350765:
            return "DateTimeType";
         case 1832993312:
            return "LutAtoBType";
         case 1833058592:
            return "LutBtoAType";
         case 1835360627:
            return "MeasurementType";
         case 1835430961:
            return "Lut8Type";
         case 1835430962:
            return "Lut16Type";
         case 1835824483:
            return "MultiLocalizedUnicodeType";
         case 1836082548:
            return "MultiProcessElementType";
         case 1852009522:
            return "NamedColor2Type";
         case 1885434465:
            return "ParametricCurveType";
         case 1886610801:
            return "ProfileSequenceDescType";
         case 1886611812:
            return "ProfileSequceIdType";
         case 1919120178:
            return "ResponseCurveSet16Type";
         case 1935897198:
            return "ScreeningType";
         case 1936077618:
            return "S15Fixed16ArrayType";
         case 1936287520:
            return "SignatureType";
         case 1952807028:
            return "TextType";
         case 1969632050:
            return "U16Fixed16ArrayType";
         case 1969827896:
            return "UInt8ArrayType";
         case 1969828150:
            return "UInt16ArrayType";
         case 1969828658:
            return "UInt32ArrayType";
         case 1969829428:
            return "UInt64ArrayType";
         case 1986618743:
            return "ViewingConditionsType";
         default:
            throw new NotSupportedException("Invalid TagTypeSignature");
      }
   }

   public static String u3(long var0) {
      switch ((int)var0) {
         case 1633842036:
            return "AbstractClass";
         case 1818848875:
            return "LinkClass";
         case 1835955314:
            return "DisplayClass";
         case 1852662636:
            return "NamedColorClass";
         case 1886549106:
            return "OutputClass";
         case 1935896178:
            return "InputClass";
         case 1936744803:
            return "ColorSpaceClass";
         default:
            throw new NotSupportedException("Invalid ProfileClassSignature");
      }
   }
}
