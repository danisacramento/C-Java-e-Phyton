����   4 I  )br/com/geekuniversity/secao03/Exercicio02  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this +Lbr/com/geekuniversity/secao03/Exercicio02; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Informe a quantidade mínima:
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I , Informe a quantidade máxima: . java/lang/StringBuilder 0 O estoque médio é igual:
 - 2  &
 - 4 5 6 append (F)Ljava/lang/StringBuilder;
 - 8 9 : toString ()Ljava/lang/String;
  < =  close args [Ljava/lang/String; quantidade_minima I quantidade_maxima estoque_medio F teclado Ljava/util/Scanner; 
SourceFile Exercicio02.java !               /     *� �    
                    	       �     K� Y� � :� � !� '<� +� !� '=`l�F� � -Y/� 1%� 3� 7� !� ;�    
   & 	          "  (  /  E  J     4    K > ?    1 @ A  ( # B A  /  C D   ? E F   G    H