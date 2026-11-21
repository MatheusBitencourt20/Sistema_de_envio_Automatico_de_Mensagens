# 📢 Marketing Notification Service — Java OOP

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)
![Paradigma](https://img.shields.io/badge/Paradigma-Orientação%20a%20Objetos-blue?style=for-the-badge)

Sistema interativo de despacho multicanal de mensagens de marketing desenvolvido em **Java**, aplicando conceitos fundamentais de **Programação Orientada a Objetos (POO)**, com foco em **Interfaces**, **Polimorfismo** e o princípio **Open/Closed (OCP)** do SOLID.

---

## 📌 Sobre o Projeto

O objetivo do projeto é permitir que uma mesma campanha publicitária ou aviso de marketing seja disparado para diferentes canais de comunicação (SMS, E-mail, Redes Sociais e WhatsApp), garantindo que cada serviço processe a entrega de acordo com as particularidades de sua plataforma.

O sistema conta com um menu interativo no console, permitindo tanto o envio direcionado para canais individuais quanto o **disparo em massa para todos os canais simultaneamente**.

---

## 🏗️ Arquitetura e Padrões de Projeto

O projeto foi modelado para evitar o acoplamento excessivo e a duplicação de código através do uso de **Interfaces**:

```mermaid
classDiagram
    class ServicoMensagem {
        <<interface>>
        +enviar(String mensagem)*
    }

    class SmsService {
        +enviar(String mensagem)
    }
    class EmailService {
        +enviar(String mensagem)
    }
    class RedeSocialService {
        +enviar(String mensagem)
    }
    class WhatsAppService {
        +enviar(String mensagem)
    }

    ServicoMensagem <|.. SmsService : implements
    ServicoMensagem <|.. EmailService : implements
    ServicoMensagem <|.. RedeSocialService : implements
    ServicoMensagem <|.. WhatsAppService : implements
