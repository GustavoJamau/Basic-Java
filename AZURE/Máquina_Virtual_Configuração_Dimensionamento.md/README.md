# ⚙️ Configurando Recursos e Dimensionamentos em Máquinas Virtuais na Azure

Explorei o processo de criação e ajuste de **recursos computacionais** em Máquinas Virtuais (VMs) na plataforma **Microsoft Azure**. O foco foi entender como personalizar e escalar a infraestrutura de acordo com a necessidade da aplicação.

## 💻 Máquina Virtual (VM) no Azure

A Máquina Virtual no Azure oferece um ambiente virtualizado com sistema operacional configurável, sendo ideal para testes, desenvolvimento e produção de aplicações de pequeno a grande porte.

### Funcionalidades:
- Escolha de sistema operacional (Linux/Windows)
- Configuração de CPU, memória e disco
- Acesso remoto via RDP ou SSH
- Gerenciamento via Azure Portal ou CLI

## 📊 Dimensionamento e Personalização

Durante a configuração da VM, é possível **dimensionar os recursos computacionais** conforme a necessidade da aplicação:

### Opções de Configuração:
- **Tamanho da Instância (SKU)**: Definição do número de núcleos de CPU e memória RAM
- **Tipo de Disco**: SSD padrão, SSD premium ou HDD
- **Rede Virtual (VNet)**: Para segmentação e controle de tráfego
- **Regras de Firewall**: Abertura de portas específicas (como 22 para SSH ou 3389 para RDP)

## 🚀 Escalabilidade

A Azure permite redimensionar a VM após sua criação, o que é útil para lidar com mudanças de carga ou otimização de custos.

### Tipos de Escalabilidade:
- **Vertical (Scale Up)**: Aumentar recursos da mesma máquina (mais CPU/RAM)
- **Horizontal (Scale Out)**: Criar múltiplas instâncias com balanceamento de carga

## ✅ Considerações Finais

Essa configuração prática foi desenvolvida como parte de um desafio da **DIO (Digital Innovation One)**, com o objetivo de compreender como gerenciar e escalar infraestruturas virtuais na nuvem utilizando os recursos da **Microsoft Azure**.
